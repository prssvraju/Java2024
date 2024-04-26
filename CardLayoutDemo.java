// importing all the necessary packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;
public class CardLayoutDemo extends JFrame implements ActionListener 
{
    CardLayout cd;
    JButton jb1, jb2, jb3;
    Container con;
    CardLayoutDemo() {
        con = getContentPane();
        cd = new CardLayout(70, 50);
        con.setLayout(cd);
        jb1 = new JButton("Hello");
        jb2 = new JButton("Hey");
        jb3 = new JButton("Hii");
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        con.add("a", jb1);
        con.add("b", jb2);
        con.add("c", jb3);
    }

    public void actionPerformed(ActionEvent e) {
        cd.next(con);
    }

    public static void main(String[] args) {
        CardLayoutDemo cl1 = new CardLayoutDemo();
        cl1.setTitle("Checking how Card Layout works");
        cl1.setSize(400, 400);
        cl1.setResizable(false);
        cl1.setVisible(true);
        cl1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}