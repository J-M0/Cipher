package enigmamachine;

/**
 *
 * @author James Morris
 */
public class SubstitutionCipher
{
    String sKey;
    final String sAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
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
        //String sEncodedText;
        String sPlainText = pPlainText.toUpperCase();
        StringBuilder sbEncodedText = new StringBuilder();
        char ch;
        
        for(int i = 0; i < sPlainText.length(); i++)
        {
            if(Character.isLetter(sPlainText.charAt(i)))
            {
                ch = encodeChar(sPlainText.charAt(i));
                sbEncodedText.append(ch);
            }
            else
            {
                sbEncodedText.append(sPlainText.charAt(i));
            }
            
        }
        
        //sEncodedText = sb.toString();
        return sbEncodedText.toString();
    }
    
    private char encodeChar(char ch)
    {
        return sKey.charAt(sAlphabet.indexOf(ch));
    }
    
    public String decode(String pEncodedText)
    {
        //String sPlainText;
        String sEncodedText = pEncodedText.toUpperCase();
        StringBuilder sbPlainText = new StringBuilder();
        char ch;
        
        for(int i = 0; i < sEncodedText.length(); i++)
        {
            if(Character.isLetter(sEncodedText.charAt(i)))
            {
                ch = decodeChar(sEncodedText.charAt(i));
                sbPlainText.append(ch);
            }
            else
            {
                sbPlainText.append(sEncodedText.charAt(i));
            }
            
        }
        
        //sPlainText = sb.toString();
        return sbPlainText.toString();
    }
    
    private char decodeChar(char ch)
    {
        return sAlphabet.charAt(sKey.indexOf(ch));
    }
}