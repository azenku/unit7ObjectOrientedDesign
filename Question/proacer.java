

/**
 * Write a description of class proacer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class proacer
{
    

    /**
     * Default constructor for objects of class proacer
     */
    public proacer()
    {
        // initialise instance variables
        x = 0;
    }

    public boolean equals(Object other)
    {
        // put your code here
        if (this.getClass()== other.getClass())
        {
            IDCard other IDCard = (IDCard) other;
            
            boolean isEqual = super.equals( otherIDCard );
            return isEqual && idNumber.equals( otherIDCard.idNumber));
        }
        
        return false;
    }

}
