import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main
{
    static int getNumber()
    {
        try
        {
            return 1;
        }
        catch ( Exception ex )
        {
            return 2;
        }
        finally
        {
            return 3;
        }
    }

    public static void main( String[] args )
    {
        // Try - Catch
        System.out.print("1. ");
        try
        {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[3]);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        System.out.print("2. ");
        try
        {
            int[] arr = null;
            System.out.println(arr[0]);
        }
        catch(java.lang.NullPointerException e)
        {
            System.out.println(e);
        }

        /*
        ArrayIndexOutOfBoundsException & NullPointerException are both classes inside
        the package java.lang
         */

        try
        {
            System.out.print("3. ");
            int n = Integer.parseInt("Zeyad003");
        }
        catch(java.lang.NumberFormatException e)
        {
            System.out.println(e);
        }

        // Any line after the exception line in the try block is Ignored
        try
        {
            System.out.print("4. ");
            int n = 5 / 0;
            System.out.println("test");
            System.out.println("test");
            System.out.println("test");
        }
        catch( java.lang.ArithmeticException e )
        {
            System.out.println(e);
        }

        // Multi-Catch block
        try
        {
            System.out.print("5. ");
            int []arr = new int[5];

            // The next operation happens from right to left, so it will be an Arithmetic Exception
            arr[10] = 7 / 0;
        }
        catch( ArrayIndexOutOfBoundsException e )
        {
            System.out.println(e);
        }
        catch( ArithmeticException ex )
        {
            System.out.println(ex);
        }

        // Union-Catch blocks
        try
        {
            System.out.print("6. ");
            int []arr = new int[5];

            // The next operation happens from right to left so, it will be an Arithmetic Exception
            arr[10] = 7 / 0;
        }
        catch( ArrayIndexOutOfBoundsException | ArithmeticException ex )
        {
            System.out.println(ex);
        }

        // "Exception" word covers all exceptions!
        try
        {
            System.out.print("7. ");
            int []arr = new int[5];

            // The next operation happens from right to left, so it will be an Arithmetic Exception
            arr[10] = 7 / 0;
        }
        catch( Exception ex )
        {
            System.out.println(ex);
        }
        // But using it is slower than writing specific exception tho

        // Finally block is executed anyway, even if there is no exception!
        // Finally block is executed anyway, even if there is ( return )
        // The finally block will not be executed if the program exits
        // By either calling System.exit(0) or by causing fatal error that causes the process to abort
        try
        {
            System.out.print("8. ");
            int[] arr = new int[]{1, 2, 3};
            arr[3] = 80;
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
//            System.exit(0);
//            return;
        }
        finally
        {
            System.out.println("Finally");
        }

        System.out.print("9. ");
        System.out.println(getNumber());

    }
}