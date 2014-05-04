package enigmamachine;
import java.awt.FileDialog;
import java.io.*;
/**
 * UnknownCipher.java uses the RotatingCipher.java as a base in order to decrypt
 * text in any .txt file that was encrypted with a rotating cipher.
 * Built for CIS252's team project assignment
 * @author Kyle Jolicoeur
 */
public class UnknownCipher 
{
    //variable declaration
    FileDialog fd;
    String sFileName; //raw input file name (with full directory)
    String sDecodeFileName;//raw, generated output file name (with full directory)
    RotatingCipher rotating;//new key to avoid issues with GUI
    
    public UnknownCipher()
    {
        //not necessary for use
    }
    
    public void decrypt() throws IOException
    {
        //creates and opens the file choosing dialog box
        fd= new FileDialog(fd, "Choose the file to decode", FileDialog.LOAD);
        fd.setFile("*.txt");//sets required file extension
        fd.setVisible(true);
        
        //grabs the full filename (with directory)
        sFileName = (fd.getDirectory() + fd.getFile());
        //generates new file name
        sDecodeFileName= sFileName.replace(".txt", "_DECODED.txt");
        
        //starts the encryption of the file
        processFile();
    }
    public void processFile() throws IOException
    {
        //variables for the lines
        String sLine;
        
        //data input objects declaration
        BufferedReader dataIn = null;
        FileReader fileIn;
        
        //data output objects declaration
        PrintWriter dataOut = null;
        FileWriter fileOut;
        
        //try-catch necessary for file I/O
        try
        {
            //Necessary for reading files
            fileIn = new FileReader(sFileName);
            dataIn = new BufferedReader(fileIn);
            
            //Necessary for writing files
            fileOut = new FileWriter(sDecodeFileName);
            dataOut = new PrintWriter(fileOut);
            
            //reads the lines, if there is a line to read (not null)
            while( (sLine = (String) dataIn.readLine()) != null )
            {
                rotating = new RotatingCipher();
                //prints the decoded line to the out file
                dataOut.println(rotating.decode(sLine));
                rotating=null;
            }
        }
        catch (IOException e)
        {
            //just generic error display
            System.out.println("error");
        }
        finally
        {
            //closes the input/output streams
            if(dataIn != null)
            {
                dataIn.close();
            }
            if(dataOut != null)
            {
                dataOut.close();
            }
        }
    }
    public String getFileName() 
    {
        return sFileName;
    }

    public void setSfileName(String sfileName) 
    {
        this.sFileName = sfileName;
    }
    
}
