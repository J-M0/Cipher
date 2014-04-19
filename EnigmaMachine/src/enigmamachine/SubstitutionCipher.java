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
            sKey = pKey;
        }
        else
        {
            //I'm not sure what to do here.
            //I should figure out some way to output an error message.
        }
    }
    
    public String encode(String pPlainText)
    {
        String sEncodedText;
        String sPlainText = pPlainText.toUpperCase();
        StringBuilder sb = new StringBuilder();
        char ch;
        
        for(int i = 0; i < sPlainText.length(); i++)
        {
            if(('A' <= sPlainText.charAt(i)) && (sPlainText.charAt(i) <= 'Z'))
            {
                ch = sKey.charAt(sKey.indexOf(sPlainText.charAt(i)));
                sb.append(ch);
            }
            else
            {
                sb.append(sPlainText.charAt(i));
            }
            
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
            if(('A' <= sEncodedText.charAt(i)) && (sEncodedText.charAt(i) <= 'Z'))
            {
                ch = sAlphabet.charAt(sAlphabet.indexOf(sEncodedText.charAt(i)));
                sb.append(ch);
            }
            else
            {
                sb.append(sEncodedText.charAt(i));
            }
            
        }
        
        sPlainText = sb.toString();
        return sPlainText;
    }
}