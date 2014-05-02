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
    
    String rotatedMiddle;
    String rotatedInner;
    
    int InnerRotorCount = 0;
    
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
                rotateRings();
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
                sbPlainText.append(rotatedInner.charAt(OuterRotor.indexOf(rotatedMiddle.charAt(OuterRotor.indexOf(sEncodedText.charAt(i))))));
                rotateRings();
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
        rotatedMiddle = MiddleRotor;
        rotatedInner =  InnerRotor;
        InnerRotorCount = 0;
    }
    
    void rotateRings()
    {
        if(InnerRotorCount == 26)
        {
            
            //rotate InnerRotor
            //Code based on Kyle's rotateKey() code in RotatingCipher.java
            StringBuilder changeKey = new StringBuilder(rotatedInner);
            char firstChar = rotatedInner.charAt(0);
            char lastChar = rotatedInner.charAt(26);
            changeKey.setCharAt(26, firstChar);
            for(int i = 0; i < 26; i++)
            {
                changeKey.setCharAt((25 - i), rotatedInner.charAt(26 - i));
            }
            rotatedInner = changeKey.toString();
            
            //rotate MiddleRotor
            changeKey = new StringBuilder(rotatedMiddle);
            firstChar = rotatedMiddle.charAt(0);
            lastChar = rotatedMiddle.charAt(26);
            changeKey.setCharAt(26, firstChar);
            for(int i = 0; i < 26; i++)
            {
                changeKey.setCharAt((25 - i), rotatedMiddle.charAt(26 - i));
            }
            rotatedMiddle = changeKey.toString();
            
            
            
            InnerRotorCount = 0;
        }
        else
        {
            //rotate InnerRotor
            //Code based on Kyle's rotateKey() code in RotatingCipher.java
            StringBuilder changeKey = new StringBuilder(rotatedInner);
            char firstChar = rotatedInner.charAt(0);
            char lastChar = rotatedInner.charAt(26);
            changeKey.setCharAt(26 ,firstChar);
            for(int i = 0; i < 26; i++)
            {
                changeKey.setCharAt((25 - i), rotatedInner.charAt(26 - i));
            }
            rotatedInner = changeKey.toString();
            InnerRotorCount++;
        }
    }
    
    public static void main(String[] args)
    {
        SimpleEnigma enigma = new SimpleEnigma();
        enigma.initializeRings();
        
//        while(true)
//        {
//            enigma.rotateRings();
//        }
        System.out.println(enigma.decode("OKNNWRDHGERPILRLAMFZF#FMUC"));
    }
}