package enigmamachine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
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
        System.out.println("encode");
        String s = "";
        SubstitutionCipher instance = null;
        String expResult = "";
        String result = instance.encode(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decode method, of class SubstitutionCipher.
     */
    @Test
    public void testDecode()
    {
        System.out.println("decode");
        String s = "";
        SubstitutionCipher instance = null;
        String expResult = "";
        String result = instance.decode(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
