import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main2
{

    static void readFile( String filePath )
    {
        // Here the compiler told me that the file that will be inserted may be not found so, I did the try-catch exception handling!
        try
        {
            FileReader reader = new FileReader( filePath );
        }
        catch ( FileNotFoundException e )
        {
            System.out.println(e);
        }
    }
    static void readFile2( String filePath )
    {
        FileInputStream fin = null;
        try
        {
            // The next line is a resource so we need to close it, using finally
            fin = new FileInputStream(filePath);
            System.out.println("file content: ");
            int r = 0;
            while ((r = fin.read()) != -1)
                System.out.print((char) r);
        }
        catch ( IOException e )
        {
            System.out.println(e);
        }
        finally
        {
            if( fin != null )
            {
                try {
                    fin.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }



    // try-with recourse ( we don't need finally block anymore )
    static void readFile3( String filePath )
    {
        try( FileInputStream fin = new FileInputStream(filePath) )
        {
            System.out.println("file content: ");
            int r = 0;
            while ((r = fin.read()) != -1)
                System.out.print((char) r);
        }
        catch ( IOException e )
        {
            System.out.println(e);
        }
    }

    // throws, I till the user -> there could be an exception here, please handle :)
    static void readFile4( String filePath ) throws IOException
    {
        FileInputStream fin = new FileInputStream(filePath);
        System.out.println("file content: ");
        int r = 0;
        while ((r = fin.read()) != -1)
            System.out.print((char) r);
    }

    // Error ( serious problem ), Ex: stackOverFlow problem
    static void infiniteRecursion(){ infiniteRecursion(); }
    public static void main( String[] args )
    {
        System.out.print("1. ");
        readFile("C:\\Users\\USER\\OneDrive\\سطح المكتب\\CP\\Functions.txt");
        readFile("C:\\Users\\USER\\OneDrive\\سطح المكتب\\CP\\Functionss.txt");

        System.out.println("2. ");
        readFile2("C:\\Users\\USER\\OneDrive\\سطح المكتب\\CP\\Complete Search.txt");
        System.out.println();
        readFile2("C:\\Users\\USER\\OneDrive\\سطح المكتب\\CP\\Complete Searchh.txt");

        System.out.println("3. ");
        try
        {
            readFile4("C:\\Users\\USER\\OneDrive\\سطح المكتب\\CP\\Complete Search.txt");
        }
        catch ( IOException e)
        {
            System.out.println(e);
        }
        System.out.println();

        // As you know, Errors can't be handled, so this is not handling to the error :)
        System.out.print("4. ");
        try
        {
            infiniteRecursion();
        }
        catch (Error e)
        {
            System.out.println(e);
        }
    }
}
