import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class funStuff implements ActionListener
{
    
    
    public void actionPerformed( ActionEvent event) 
    {
       System.out.println("Button " + event.getActionCommand() + " was clickieded!!");
    }
}
