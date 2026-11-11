import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

// ===== Lớp cha (abstract) =====
abstract class Shape {
    int x1, y1, x2, y2;

    Shape(int x, int y) {
        x1 = x2 = x;
        y1 = y2 = y;
    }

    void setEnd(int x, int y) {
        x2 = x;
        y2 = y;
    }

    abstract void draw(Graphics g);
    abstract double area ();
}

// ===== Hình chữ nhật =====
class Rect extends Shape {
    Rect(int x, int y) {
        super(x, y);
    }

    @Override
    void draw(Graphics g) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int w = Math.abs(x2 - x1);
        int h = Math.abs(y2 - y1);
        g.drawRect(x, y, w, h);
    }

    double area(){
        int w = Math.abs(x2 - x1);
        int h = Math.abs(y2 - y1);
        return w*h;
    }
}

// ===== Hình tròn / elip =====
class Circle extends Shape {
    Circle(int x, int y) {
        super(x, y);
    }

    @Override
    void draw(Graphics g) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int w = Math.abs(x2 - x1);
        int h = Math.abs(y2 - y1);
        g.drawOval(x, y, w, h);
    }

    double area(){
        double w = Math.abs(x2 - x1) / 2;
        double h = Math.abs(y2 - y1) / 2;
        return Math.PI*w*h;
    }
}

// ===== Tam giác =====
class Triangle extends Shape {
    Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    void draw(Graphics g) {
        int left = Math.min(x1, x2);
        int top = Math.min(y1, y2);
        int w = Math.abs(x2 - x1);
        int h = Math.abs(y2 - y1);

        int[] xs = {left + w / 2, left, left + w};
        int[] ys = {top, top + h, top + h};

        g.drawPolygon(xs, ys, 3);
    }

    double area() {
        int w = Math.abs(x2 - x1);
        int h = Math.abs(y2 - y1);
        return w * h / 2.0;
    }
}

// ===== Đường thẳng =====
class Line extends Shape {
    Line(int x, int y) {
        super(x, y);
    }

    @Override
    void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }

    double area() {
        return 0;
    }
}

// ===== Hình vuông (kế thừa từ Shape) =====
class Square extends Shape {
    Square(int x, int y) {
        super(x, y);
    }

    @Override
    void draw(Graphics g) {
        int side = Math.min(Math.abs(x2 - x1), Math.abs(y2 - y1));

        int x = x1;
        if (x2 < x1) {
            x = x1 - side;
        }

        int y = y1;
        if (y2 < y1) {
            y = y1 - side;
        }

        g.drawRect(x, y, side, side);
    }

    double area() {
        int side = Math.min(Math.abs(x2 - x1), Math.abs(y2 - y1));
        return side * side;
    }
}

// ===== Vùng vẽ =====
class DrawingCanvas extends Canvas {
    ArrayList<Shape> shapes = new ArrayList<>();
    Shape current;
    String selected = "Rect";

    DrawingCanvas() {
        setBackground(Color.WHITE);

        MouseAdapter mouse = new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                switch (selected) {
                    case "Rect":
                        current = new Rect(x, y);
                        break;
                    case "Circle":
                        current = new Circle(x, y);
                        break;
                    case "Triangle":
                        current = new Triangle(x, y);
                        break;
                    case "Line":
                        current = new Line(x, y);
                        break;
                    case "Square":
                        current = new Square(x, y);
                        break;
                }

                if (current != null) {
                    shapes.add(current);
                }
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (current != null) {
                    current.setEnd(e.getX(), e.getY());
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (current != null) {
                    current.setEnd(e.getX(), e.getY());
                    System.out.println("Area: " + current.area());
                    current = null;
                    repaint();
                }
            }

        };

        addMouseListener(mouse);
        addMouseMotionListener(mouse);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);

        // ĐA HÌNH (POLYMORPHISM)
        for (Shape s : shapes) {
            s.draw(g);
        }
    }
}

// ===== Chương trình chính =====
public class SimplePaint extends Frame {

    SimplePaint() {
        super("Simple Paint - Java OOP");

        setSize(800, 600);
        setLayout(new BorderLayout());

        DrawingCanvas canvas = new DrawingCanvas();

        // Thanh công cụ
        Panel toolbar = new Panel();

        Button btnRect = new Button("Rect");
        Button btnCircle = new Button("Circle");
        Button btnTriangle = new Button("Triangle");
        Button btnLine = new Button("Line");
        Button btnSquare = new Button("Square");

        toolbar.add(btnRect);
        toolbar.add(btnCircle);
        toolbar.add(btnTriangle);
        toolbar.add(btnLine);
        toolbar.add(btnSquare);

        // Chọn hình khi bấm nút
        btnRect.addActionListener(e -> canvas.selected = "Rect");
        btnCircle.addActionListener(e -> canvas.selected = "Circle");
        btnTriangle.addActionListener(e -> canvas.selected = "Triangle");
        btnLine.addActionListener(e -> canvas.selected = "Line");
        btnSquare.addActionListener(e -> canvas.selected = "Square");

        add(toolbar, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        // Đóng cửa sổ
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new SimplePaint());
    }
}