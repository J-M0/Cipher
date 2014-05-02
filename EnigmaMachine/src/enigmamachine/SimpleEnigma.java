package enigmamachine;

/**
 *
 * @author James Morris
 */
public class SimpleEnigma
{
    String OuterRotor;
    String MiddleRotor;
    String InnerRotor;
    
    public SimpleEnigma()
    {
        OuterRotor = "#BDFHJLNPRTVXZACEGIKMOQSUWY";
        MiddleRotor = "#EJOTYCHMRWAFKPUZDINSXBGLQV";
        InnerRotor = "#GNUAHOVBIPWCJQXDKRYELSZFMT";
    }
    
    public SimpleEnigma(String OuterRotor, String MiddleRotor, String InnerRotor)
    {
        this.OuterRotor = OuterRotor;
        this.MiddleRotor = MiddleRotor;
        this.InnerRotor = InnerRotor;
    }
    
    public String encode(String pPlainText)
    {
        String sPlainText = pPlainText.toUpperCase();
        StringBuilder sbEncodedText = new StringBuilder();
        initializeRings();
        
        //Turn spaces into #
        sPlainText = sPlainText.replace(' ', '#');
        
        for(int i = 0; i < sPlainText.length(); i++)
        {
            if(Character.isLetter(sPlainText.charAt(i)) || sPlainText.charAt(i) == '#')
            {
                sbEncodedText.append(OuterRotor.charAt(MiddleRotor.indexOf(OuterRotor.charAt(InnerRotor.indexOf(sPlainText.charAt(i))))));
//                rotateRings();
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
        initializeRings();
        
        for(int i = 0; i < sEncodedText.length(); i++)
        {
            if(Character.isLetter(sEncodedText.charAt(i)) || sEncodedText.charAt(i) == '#')
            {
                sbPlainText.append(InnerRotor.charAt(OuterRotor.indexOf(MiddleRotor.charAt(OuterRotor.indexOf(sEncodedText.charAt(i))))));
//                rotateRings();
            }
            else
            {
                sbPlainText.append(sEncodedText.charAt(i));
            }
        }
        
//        sbPlainText.re
        
        return sbPlainText.toString();
    }
    
    void initializeRings()
    {
        OuterRotor =  "#BDFHJLNPRTVXZACEGIKMOQSUWY";
        MiddleRotor = "#EJOTYCHMRWAFKPUZDINSXBGLQV";
        InnerRotor =  "#GNUAHOVBIPWCJQXDKRYELSZFMT";
    }
    
    void rotateRings()
    {
        
    }
}