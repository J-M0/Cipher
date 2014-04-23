/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class CaesarCipherTest
{
    
    public CaesarCipherTest()
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
     * Test of encode method, of class CaesarCipher.
     */
    @Test
    public void testEncode()
    {
        System.out.println("Test of CaesarCihper.encode()");
        CaesarCipher instance = new CaesarCipher();
        
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        //DEFGHIJKLMNOPQRSTUVWXYZABC
        assertEquals("KHOOR ZRUOG", instance.encode("Hello World"));
        assertEquals("QRZ LV WKH WLPH IRU DOO JRRG PHQ WR FRPH WR WKH DLG RI WKHLU FRXQWUB.", 
                instance.encode("Now is the time for all good men to come to the aid of their country."));
    }

    /**
     * Test of decode method, of class CaesarCipher.
     */
    @Test
    public void testDecode()
    {
        System.out.println("Test of CaesarCihper.encode()");
        CaesarCipher instance = new CaesarCipher();
        
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        //DEFGHIJKLMNOPQRSTUVWXYZABC
        assertEquals("HELLO WORLD", instance.decode("Khoor Zruog"));
        assertEquals("NOW IS THE TIME FOR ALL GOOD MEN TO COME TO THE AID OF THEIR COUNTRY.", 
                instance.decode("Qrz lv wkh wlph iru doo jrrg phq wr frph wr wkh dlg ri wkhlu frxqwub."));
    }
    
}
