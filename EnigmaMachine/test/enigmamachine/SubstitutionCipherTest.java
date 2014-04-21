package enigmamachine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James Morris
 */
public class SubstitutionCipherTest
{
    
    public SubstitutionCipherTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of encode method, of class SubstitutionCipher.
     */
    @Test
    public void testEncode()
    {
        System.out.println("Test of SubstituionCihper.encode()");
        SubstitutionCipher instance = new SubstitutionCipher();
        
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        //FGHIJKLMNOPQRSTUVWXYZABCDE
        assertEquals("MJQQT BTWQI", instance.encode("Hello World"));
        assertEquals("STB NX YMJ YNRJ KTW FQQ LTTI RJS YT HTRJ YT YMJ FNI TK YMJNW HTZSYWD.", 
                instance.encode("Now is the time for all good men to come to the aid of their country."));
        
        instance.setKey("bcdefghijklmnopqrstuvwxyza");
        
        assertEquals("BCDEFGHIJKLMNOPQRSTUVWXYZA", instance.getKey());
        
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        //BCDEFGHIJKLMNOPQRSTUVWXYZA
        assertEquals("IFMMP XPSME", instance.encode("Hello World"));
        assertEquals("OPX JT UIF UJNF GPS BMM HPPE NFO UP DPNF UP UIF BJE PG UIFJS DPVOUSZ.", 
                instance.encode("Now is the time for all good men to come to the aid of their country."));
    }

    /**
     * Test of decode method, of class SubstitutionCipher.
     */
    @Test
    public void testDecode()
    {
        System.out.println("Test of SubstitutionCipher.decode()");
        SubstitutionCipher instance = new SubstitutionCipher();
        
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        //FGHIJKLMNOPQRSTUVWXYZABCDE
        assertEquals("HELLO WORLD", instance.decode("Mjqqt Btwqi"));
        assertEquals("NOW IS THE TIME FOR ALL GOOD MEN TO COME TO THE AID OF THEIR COUNTRY.", 
                instance.decode("Stb nx ymj ynrj ktw fqq ltti rjs yt htrj yt ymj fni tk ymjnw htzsywd."));
        
        instance.setKey("bcdefghijklmnopqrstuvwxyza");
        
        assertEquals("BCDEFGHIJKLMNOPQRSTUVWXYZA", instance.getKey());
        
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        //BCDEFGHIJKLMNOPQRSTUVWXYZA
        assertEquals("HELLO WORLD", instance.decode("Ifmmp Xpsme"));
        assertEquals("NOW IS THE TIME FOR ALL GOOD MEN TO COME TO THE AID OF THEIR COUNTRY.", 
                instance.decode("Opx jt uif ujnf gps bmm hppe nfo up dpnf up uif bje pg uifjs dpvousz."));
    }
}