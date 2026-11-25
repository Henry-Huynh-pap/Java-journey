import java.awt.*;
import java.awt.event.*;
public class AWTEvent extends Frame implements ActionListener
{
    public AWTEvent()
    {
        this.setSize(500, 500);
        this.show();
        //mac dinh la Border Layout

        Panel p = new Panel();

        //mac dinh la FlowLayout
        Button b51=new Button("Red");
        b51.addActionListener(this);
        p.add(b51);
        Button b52=new Button("Blue");
        b52.addActionListener(this);
        p.add(b52);
        Button b53=new Button("Yellow");
        b53.addActionListener(this);
        p.add(b53);
        Button b54=new Button("Black");
        b54.addActionListener(this);
        p.add(b54);

        this.add(p,BorderLayout.NORTH);
    }
    public static void main(String[] args) {

        new AWTEvent();


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Red"))
            this.setBackground(Color.red);
        if (e.getActionCommand().equals("Blue"))
            this.setBackground(Color.blue);
        if (e.getActionCommand().equals("Yellow"))
            this.setBackground(Color.yellow);
        if (e.getActionCommand().equals("Black"))
            this.setBackground(Color.black);
    }

}