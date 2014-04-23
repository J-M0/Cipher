package enigmamachine;

/**
 *
 * @author James Morris
 */
public class CaesarCipher
{
    final String KEY = "DEFGHIJKLMNOPQRSTUVWXYZABC";
    final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public CaesarCipher()
    {
        
    }
    
    public String encode(String pPlainText)
    {
        String sPlainText = pPlainText.toUpperCase();
        StringBuilder sbEncodedText = new StringBuilder();
        
        for(int i = 0; i < sPlainText.length(); i++)
        {
            if(Character.isLetter(sPlainText.charAt(i)))
            {
                sbEncodedText.append(KEY.charAt(ALPHABET.indexOf(sPlainText.charAt(i))));
            }
            else
            {
                sbEncodedText.append(sPlainText.charAt(i));
            }
        }
        
        return sbEncodedText.toString();
    }
    
    public String decode(String pEncodedText)
    {
        String sEncodedText = pEncodedText.toUpperCase();
        StringBuilder sbPlainText = new StringBuilder();
        
        for(int i = 0; i < sEncodedText.length(); i++)
        {
            if(Character.isLetter(sEncodedText.charAt(i)))
            {
                sbPlainText.append(ALPHABET.charAt(KEY.indexOf(sEncodedText.charAt(i))));
            }
            else
            {
                sbPlainText.append(sEncodedText.charAt(i));
            }
        }
        
        return sbPlainText.toString();
    }
}