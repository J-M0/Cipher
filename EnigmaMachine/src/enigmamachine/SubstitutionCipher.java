package enigmamachine;

/**
 *
 * @author James Morris
 */
public class SubstitutionCipher
{
    String sKey;
    final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public SubstitutionCipher()
    {
        setKey("FGHIJKLMNOPQRSTUVWXYZABCDE");
    }
    
    public SubstitutionCipher(String pKey)
    {
        setKey(pKey);
    }
    
    public String getKey()
    {
        return sKey;
    }
    
    public void setKey(String pKey)
    {
        if(pKey.length() == 26)
        {
            sKey = pKey.toUpperCase();
        }
        else
        {
            //I'm not sure what to do here.
            //I should figure out some way to output an error message.
        }
    }
    
    public String encode(String pPlainText)
    {
        String sPlainText = pPlainText.toUpperCase();
        StringBuilder sbEncodedText = new StringBuilder();
        
        for(int i = 0; i < sPlainText.length(); i++)
        {
            if(Character.isLetter(sPlainText.charAt(i)))
            {
                sbEncodedText.append(sKey.charAt(ALPHABET.indexOf(sPlainText.charAt(i))));
            }
            else
            {
                sbEncodedText.append(sPlainText.charAt(i));
            }
        }
        
        return sbEncodedText.toString();
    }
    
    /*private char encodeChar(char ch)
    {
        return sKey.charAt(ALPHABET.indexOf(ch));
    }*/
    
    public String decode(String pEncodedText)
    {
        String sEncodedText = pEncodedText.toUpperCase();
        StringBuilder sbPlainText = new StringBuilder();
        
        for(int i = 0; i < sEncodedText.length(); i++)
        {
            if(Character.isLetter(sEncodedText.charAt(i)))
            {
                sbPlainText.append(ALPHABET.charAt(sKey.indexOf(sEncodedText.charAt(i))));
            }
            else
            {
                sbPlainText.append(sEncodedText.charAt(i));
            }
        }
        
        return sbPlainText.toString();
    }
    
    /*private char decodeChar(char ch)
    {
        return ALPHABET.charAt(sKey.indexOf(ch));
    }*/
}