import java.util.Scanner;
public class FillInQuestion extends Question
{
    // override the settext method to extract answer
    /*"the inventor of java was _James_"
     * 
     * text "the inventor of java was ______"
     */
    public void setText( String questionText )
    {
        Scanner parser= new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "______" + parser.next();
        //you have to call super because it then uses the set text from the main Question class
        super.setText(question);
        setAnswer(answer);
    }
}
