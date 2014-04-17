package enigmamachine;

/**
 *
 * @author James Morris
 */
public class SubstitutionCipher
{
    String sKey;
    
    public SubstitutionCipher()
    {
        sKey = "fghijklmnopqrstuvwxyzabcde";
    }
    
    public SubstitutionCipher(String pKey)
    {
        sKey = pKey;
    }
    
    public String encode(String s)
    {
        String sEncodedText;
        StringBuilder sb = new StringBuilder();
        
        
        sEncodedText = sb.toString();
        return sEncodedText;
    }
    
    public String decode(String s)
    {
        String sDecodedText;
        StringBuilder sb = new StringBuilder();
        
        
        sDecodedText = sb.toString();
        return sDecodedText;
    }
}
