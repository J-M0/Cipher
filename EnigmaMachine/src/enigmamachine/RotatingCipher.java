package enigmamachine;
/**
 * Some of this code is referenced from SubstitutionCipher.java due to the 
 * similarity of the use of the code, which was created by James Morris.
 * @author Kyle Jolicoeur
 */
public class RotatingCipher 
{
    
    final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String tempAlphabet = "DEFGHIJKLMNOPQRSTUVWXYZABC";
    public RotatingCipher()
    {
    }
    public String encode(String sPlain)
    {
    //Start referenced code from James Morris's code in SubstitutionCipher.java
        String sEncodeUpMe = sPlain.toUpperCase();
        StringBuilder sbEncodedText = new StringBuilder();
        
        for(int i = 0; i < sEncodeUpMe.length(); i++)
        {
            if(Character.isLetter(sEncodeUpMe.charAt(i)))
            {
                sbEncodedText.append(tempAlphabet.charAt(ALPHABET.indexOf(sEncodeUpMe.charAt(i))));
                rotateKey(tempAlphabet);
            }
            else
            {
                sbEncodedText.append(sEncodeUpMe.charAt(i));
            }
        }
        return sbEncodedText.toString();
    //End referenced code
    }
    public String decode(String sEncoded)
    {
    //Start referenced code from James Morris's code in SubstitutionCipher.java
        String sEncodedUpText = sEncoded.toUpperCase();
        StringBuilder sbPlainText = new StringBuilder();
        
        for(int i = 0; i < sEncodedUpText.length(); i++)
        {
            if(Character.isLetter(sEncodedUpText.charAt(i)))
            {
                sbPlainText.append(ALPHABET.charAt(tempAlphabet.indexOf(sEncodedUpText.charAt(i))));
                rotateKey(tempAlphabet);
            }
            else
            {
                sbPlainText.append(sEncodedUpText.charAt(i));
            }
        }
        return sbPlainText.toString();
    //End referenced code
    }
    public void rotateKey(String tempKey)
    {
        StringBuilder changeKey = new StringBuilder(tempKey);
        char firstChar = tempKey.charAt(0);
        char lastChar = tempKey.charAt(25);
        changeKey.setCharAt(25,firstChar);
        for(int i=0; i<25; i++)
        {
            changeKey.setCharAt((24 - i), tempKey.charAt(25-i));
        }
        tempAlphabet= changeKey.toString();
    }    
    public String getKey()
    {
        return tempAlphabet;
    }
    public void setKey(String sKey)
    {
        tempAlphabet = sKey;
    }
}
