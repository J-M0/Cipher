/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enigmamachine;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James Morris
 */
public class SimpleEnigmaTest {
    
    public SimpleEnigmaTest()
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

    /**
     * Test of encode method, of class SimpleEnigma.
     */
    @Test
    public void testEncode()
    {
        System.out.println("encode");
        String pPlainText = "CONGRATULATIONS YOU GOT IT";
        SimpleEnigma instance = new SimpleEnigma();
        String expResult = "OKNNWRDHGERPILRLAMFZF#FMUC";
        String result = instance.encode(pPlainText);
        assertEquals(expResult, result);
    }

    /**
     * Test of decode method, of class SimpleEnigma.
     */
    @Test
    public void testDecode()
    {
        System.out.println("decode");
        String pEncodedText = "OKNNWRDHGERPILRLAMFZF#FMUC";
        SimpleEnigma instance = new SimpleEnigma();
        String expResult = "CONGRATULATIONS YOU GOT IT";
        String result = instance.decode(pEncodedText);
        assertEquals(expResult, result);
    }

}