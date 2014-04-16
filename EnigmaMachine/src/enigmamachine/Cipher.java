package enigmamachine;

public class Cipher 
{
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String CAESAR_SHIFTED = "defghijklmnopqrstuvwxyzabc";
    Cipher()
    {
    //does nothing    
    }
    /***********************************************************************/
    //encodes a Caesar's encrypted character
    public char encodeCaesar(char character)
    {
        int index = Cipher.ALPHABET.indexOf(character);
        return Cipher.CAESAR_SHIFTED.charAt(index);
    }
    
    //decodes a Caesar;s encrypted character
    public char decodeCaesar(char character)
    {
        int index = Cipher.CAESAR_SHIFTED.indexOf(character);
        return Cipher.ALPHABET.charAt(index);
    }
    /**********************************************************************/
    
}
