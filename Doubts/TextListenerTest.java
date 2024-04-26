import javax.swing.*;
import java.awt.event.*;

public class TextListenerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Listener Example");
        JTextField textField = new JTextField();
        JButton button = new JButton("Click Me");

        // Register a TextListener for the text field
      /*   textField.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                System.out.println("Text changed: " + textField.getText());
            }
        });*/

        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                    //textField.setText("Event Trigered");
                    //System.out.println("Even fired");
                    textField.setText("Hello");
            }
        });

        // Register an ActionListener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button clicked!");
            }
        });

        // Set up the layout
        frame.setLayout(null);
        textField.setBounds(50, 50, 200, 30);
        button.setBounds(50, 100, 100, 30);

        // Add components to the frame
        frame.add(textField);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}