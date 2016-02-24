import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ClickListener implements ActionListener
{
    private int count;
    private String name;
    
    public ClickListener(String buttonName)
    {
        count = 0;
        
        this.name = buttonName;
    }
    
    public void actionPerformed( ActionEvent event) 
    {
        count++;
        
        if(count ==1)
        {
            System.out.println("WOW u mADE $29729384!!!");
            
        }
        else
        {
            System.out.println("HOLY DANG NUTS U GOT MFIN STACKS MULTIPLIED BY: " + count+ " BOI!!!11!!!1");
        }
        
        System.out.println("da button " + name + " was clicked");
    }
}
