import javax.swing.*;
import javax.swing.text.LabelView;

import java.awt.Label;
import java.awt.event.*; 
class MenuExample extends JFrame
{  
    JMenuBar mb;      
    JMenu menu, submenu; 
    JMenuItem i1, i2, i3, i4, i5; 
    JComboBox cb;
    JLabel llab,clab,textarealab,tplab,lradio,lcheckbox,ltoggle,ltf,lbt;

    JTextArea textArea;
    JScrollPane scrollableTextArea;

    JList<String> list1;

    JTabbedPane tp;
    JRadioButton r1,r2;
    ButtonGroup bg;

    JCheckBox cb1,cb2;

    JToggleButton toggleButton;
    JTextField txf;
    JButton jbt;
    MenuExample()
    {  

        String country[]={"India","Aus","U.S.A","England","Newzealand"};        
        
        clab = new JLabel("Combo Box");
        clab.setBounds(10, 50, 100, 20);
        
        cb=new JComboBox(country);    
        cb.setBounds(100, 50,90,20);  

        llab = new JLabel("List");
        llab.setBounds(10, 80, 100, 20);

        final DefaultListModel<String> l1 = new DefaultListModel<>();  
        l1.addElement("C");  
        l1.addElement("C++");  
        l1.addElement("Java");  
        l1.addElement("PHP");  
        list1 = new JList<>(l1);  
        list1.setBounds(100,80, 100,75);  
        
        textarealab = new JLabel("Text Area");
        textarealab.setBounds(10, 150, 100, 20);
        
        textArea = new JTextArea(5, 20); 
        textArea.setBounds(100, 160, 100, 100); 
        scrollableTextArea = new JScrollPane(textArea);
        
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        
        tplab = new JLabel("Tabbed Panel");
        tplab.setBounds(10, 270, 100, 20);
        JPanel p1=new JPanel();  
        JPanel p2=new JPanel();  
        JPanel p3=new JPanel(); 
        JButton tbbt1 = new JButton("Main Click"); 
        p1.add(tbbt1);
        JButton tbbt2 = new JButton("Visit Click"); 
        p2.add(tbbt2);
        tp=new JTabbedPane();  
        tp.setBounds(100,270,200,100);  
        tp.add("main",p1);  
        tp.add("visit",p2);  
        tp.add("help",p3);    
    
        add(tplab);
        add(tp);  

        lradio = new JLabel("Radio");
        lradio.setBounds(10, 370, 100, 20);

        r1=new JRadioButton("A) Male");    
        r2=new JRadioButton("B) Female");    
        r1.setBounds(100,370,100,30);    
        r2.setBounds(200,370,100,30);    
        bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);    

        add(lradio);
        add(r1);
        add(r2);

        lcheckbox = new JLabel("Check Box");
        lcheckbox.setBounds(10, 400, 100, 20);

        JCheckBox cb1 = new JCheckBox("Ap");  
        cb1.setBounds(100,400, 100,20);  
        JCheckBox cb2 = new JCheckBox("Telangana", true);  
        cb2.setBounds(200,400, 100,20); 
        
        add(lcheckbox);
        add(cb1);
        add(cb2);

        ltoggle = new JLabel("Toggle");
        ltoggle.setBounds(10, 430, 100, 20);

        toggleButton = new JToggleButton("On");
        toggleButton.setBounds(100, 430, 100, 20);

        ItemListener itemListener = new ItemListener() {
            // itemStateChanged() method is invoked automatically
            // whenever you click or unclick on the Button.
            public void itemStateChanged(ItemEvent itemEvent)
            {
                // event is generated in button
                int state = itemEvent.getStateChange();
                // if selected print selected in console
                if (state == ItemEvent.SELECTED) {
                    //System.out.println("Selected");
                    toggleButton.setText("On");
                }
                else {
                    // else print deselected in console
                    //System.out.println("Deselected");
                    toggleButton.setText("Off");
                }
            }
        };
        toggleButton.addItemListener(itemListener);
        add(ltoggle);
        add(toggleButton);


        ltf = new JLabel("Text Field");
        ltf.setBounds(10, 460, 100, 20);

        txf = new JTextField("Info");
        txf.setBounds(100, 460, 100, 20);

        add(ltf);
        add(txf);


        lbt = new JLabel("Button");
        lbt.setBounds(10, 490, 100, 20);

        jbt = new JButton("Click");
        jbt.setBounds(100, 490, 100, 20);
        add(lbt);
        add(jbt);

        mb=new JMenuBar();  
        menu=new JMenu("Menu");  
        submenu=new JMenu("Sub Menu");  
        i1=new JMenuItem("Item 1");  
        i2=new JMenuItem("Item 2");  
        i3=new JMenuItem("Item 3");  
        i4=new JMenuItem("Item 4");  
        i5=new JMenuItem("Item 5");  
        menu.add(i1); menu.add(i2); menu.add(i3);  
        submenu.add(i4); submenu.add(i5);  
        menu.add(submenu);  
        mb.add(menu);  
        setJMenuBar(mb);
        
        add(clab);
        add(cb);

        add(llab);
        add(list1);

        add(textarealab);
        add(textArea);

        setSize(800,800);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }  
    public static void main(String args[])  
    {  
    new MenuExample();  
    }
}  