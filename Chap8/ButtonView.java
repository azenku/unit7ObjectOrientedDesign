import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class ButtonView
{
    private static final int FRAME_W = 100;
    private static final int FRAME_H = 100;
    
    public static void main( String[] args )
    {
        JFrame frame= new JFrame();
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel();
        panel.add(label);
        
        JButton button = new JButton( "bet all 435 skins on underdog??");
        panel.add(button);
        
        JButton button2 = new JButton( "bet all 435 skins on the non underdog??");
        panel.add(button2);
        
        frame.add(panel);
        ClickListener listener = new ClickListener("underdoge");
        button.addActionListener( listener );
        
        ClickListener listener2 = new ClickListener("topdoge");
        button2.addActionListener( listener2 );
        
        
        
        JButton button3 = new JButton( "a");
        panel.add(button3);
        
        JButton button4 = new JButton( "b");
        panel.add(button4);
        
        
        ClickListener listener3 = new ClickListener("a");
        button3.addActionListener( listener3 );
        
        ClickListener listener4 = new ClickListener("b");
        button4.addActionListener( listener4 );
        
        
        frame.add(panel);
        
        
        frame.setSize(FRAME_W,FRAME_H);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
