import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyCode extends JFrame  {
    public JTextArea ta;
    public JLabel la;
    KeyCode()
    {
        
        ta = new JTextArea(10, 20);
        add(ta);
        la = new JLabel("jkljkl");
        add(la);
        ta.addKeyListener(new KeyLimp());
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String args[])
    {
        KeyCode kc = new KeyCode();
    }
}

