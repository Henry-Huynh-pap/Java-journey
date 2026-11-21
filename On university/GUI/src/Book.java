import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Book extends JFrame{

    JFrame f = new JFrame("Factorial");
    JLabel lblNumN = new JLabel("Num n = ");
    JTextField tfNumN = new JTextField(10);
    JLabel lblResult = new JLabel("Result = ");
    JTextField tfResult = new JTextField(10);
    JButton btnFact = new JButton("Fact");

    public Book(){
        f.setLayout(new GridLayout(3,2));
        f.add(lblNumN);
        f.add(tfNumN);
        f.setSize(300,200);
        f.setVisible(true);
        f.add(lblResult);
        f.add(tfResult);
        f.add(btnFact);
        btnFact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int n = Integer.parseInt(tfNumN.getText());
                int fact = 1;
                for(int i =2; i<=n; i++){
                    fact = fact * i;
                }
                tfResult.setText(String.valueOf(fact));
            }
        });
    }

    public static void main(String args[]){
        Book book = new Book();
    }
}