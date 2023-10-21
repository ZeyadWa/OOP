public class Main3
{
    public static void validate( int number )
    {
        if( number <= 0 )
        {
            throw new ArithmeticException("The number must be greater than zero");
        }
    }

    public static void validate2( int id )
    {
        if( id > 100 )
        {
            MyCustomException wtf = new MyCustomException("Number is greater than 100 :(");
            throw wtf;
        }
    }
    public static void main( String[] args )
    {
        try
        {
            validate(-1);
        }
        catch( ArithmeticException e )
        {
            System.out.println(e);
        }

        try
        {
            validate2(200);
        }
        catch(MyCustomException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
