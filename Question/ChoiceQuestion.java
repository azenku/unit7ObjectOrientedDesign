

public class ChoiceQuestion extends Question
{
    private int numberOfChoices;
    
    public ChoiceQuestion()
    {
        super();
        numberOfChoices = 0;
    }
    
    
    public void addChoice( String choice, boolean correct)
    {
        numberOfChoices++;
        //this adds the text of the number of choice and the text of the choice
        this.addText( "\n" + numberOfChoices + ") " + choice );
        
        if( correct)
        {
            String choiceString = "" + numberOfChoices;
            this.setAnswer( choiceString );
        }
    }
}
