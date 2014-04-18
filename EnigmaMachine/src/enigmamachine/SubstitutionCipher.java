package enigmamachine;

/**
 *
 * @author James Morris
 */
public class SubstitutionCipher
{
    String sKey;
    String sAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public SubstitutionCipher()
    {
        sKey = "FGHIJKLMNOPQRSTUVWXYZABCDE";
    }
    
    public SubstitutionCipher(String pKey)
    {
        sKey = pKey;
    }
    
    public String encode(String pPlainText)
    {
        String sEncodedText;
        String sPlainText = pPlainText.toUpperCase();
        StringBuilder sb = new StringBuilder();
        char ch;
        
        for(int i = 0; i < sPlainText.length(); i++)
        {
            ch = sKey.charAt(sKey.indexOf(sPlainText.charAt(i)));
            
            sb.append(ch);
        }
        
        sEncodedText = sb.toString();
        return sEncodedText;
    }
    
    public String decode(String pEncodedText)
    {
        String sPlainText;
        String sEncodedText = pEncodedText.toUpperCase();
        StringBuilder sb = new StringBuilder();
        char ch;
        
        for(int i = 0; i < sEncodedText.length(); i++)
        {
            ch = sAlphabet.charAt(sAlphabet.indexOf(sEncodedText.charAt(i)));
            
            sb.append(ch);
        }
        
        sPlainText = sb.toString();
        return sPlainText;
    }
}
