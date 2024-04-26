import java.awt.event.*;
import java.awt.*;
class KeyLimp extends KeyCode implements KeyListener
{
    @Override
    public void keyTyped(KeyEvent e) {
         la.setText("Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        la.setText("Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        la.setText("Released");
    }

}
