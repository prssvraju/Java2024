import java.awt.*;
import java.awt.event.*;
class MouseCode extends Frame implements MouseMotionListener
{
    Label lb;
    
    MouseCode()
    {
        
        lb = new Label("");
        add(lb);
        addMouseMotionListener(this);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String args[])
    {
        MouseCode mc = new MouseCode();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        int x,y;
        x=e.getX();
        y=e.getY();
        lb.setText("X :"+x+"Y :"+y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        int x,y;
        x=e.getX();
        y=e.getY();
        lb.setText("X :"+x+"Y :"+y);
    }

}
