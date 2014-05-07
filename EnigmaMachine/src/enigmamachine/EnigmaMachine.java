package enigmamachine;
/* 
 * This class just creates the necessary objects for the rest of the program.
 * This Enigma Machine program is for CIS 252 and is created by:
 * James Morris and Kyle Jolicoeur.
 * 
*/
public class EnigmaMachine 
{
    public static void main(String[] args) 
    {
        EnigmaGUI g1 = new EnigmaGUI();
        g1.setVisible(true);
        g1.setLocationRelativeTo(null);
        g1.setSize(594, 324);
    }
}
