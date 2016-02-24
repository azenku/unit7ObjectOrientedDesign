import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class forFiun
{
    private static final int FRAME_W = 100;
    private static final int FRAME_H = 100;

    private JFrame frame;
    private JPanel panel; 
    private JLabel label;
    private JButton button;
    private JButton button2;
    public forFiun()
    {

        frame= new JFrame();
        panel = new JPanel();

        label = new JLabel();
        panel.add(label);

        button = new JButton( "bet all 435 skins on underdog??");
        panel.add(button);

        button2 = new JButton( "bet all 435 skins on the non underdog??");
        panel.add(button2);

        frame.add(panel);
        funStuff listener = new funStuff();
        button.addActionListener( listener );

        funStuff listener2 = new funStuff();
        button2.addActionListener( listener2 );

       
        frame.setSize(FRAME_W,FRAME_H);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main( String[] args )
    {
        forFiun view = new forFiun();

        
        
        
    }
    
    public class funStuff implements ActionListener
    {

        public void actionPerformed( ActionEvent event) 
        {
            label.setText("Button " + event.getActionCommand() + " was clickieded!!");
        }
    }
}
