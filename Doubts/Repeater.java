import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

class Repeater extends JFrame implements ActionListener
{

   JLabel inLabel     = new JLabel( "Enter Your Name:  " ) ;
   JTextField inText  = new JTextField( 15 );

   JLabel outLabel    = new JLabel( "Here is Your Name :" ) ;
   JTextField outText = new JTextField( 15 );
   
   public Repeater( String title)      // constructor
   {  
      super( title );
      setLayout( new FlowLayout() ); 
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;

      inText.addActionListener( this );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
   }

  // The application code.
  void copyText()
  {
    String name = inText.getText();
    outText.setText( name );
  }

  public void actionPerformed( ActionEvent evt)  
  {
    copyText();
    repaint();                  
  }

  public static void main ( String[] args )
  {
    Repeater echo  = new Repeater( "Repeater" ) ;
    echo.setSize( 300, 100 );     
    echo.setVisible( true );      
  }
}