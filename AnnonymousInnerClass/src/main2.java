public class main2
{
    public interface Showable
    {
        public void print( int x );
    }
    static void display( Showable s )
    {
        s.print(4);
    }
    public static void main( String[] args )
    {
        Showable s = new Showable()
        {
            @Override
            public void print( int x )
            {
                System.out.println("Yay! " + x );
            }
        };
        s.print(1);

        new Showable()
        {
            @Override
            public void print( int x )
            {
                System.out.println("Yay! " + x );
            }
        }.print(2);

        // We can use lambda Expression also!
        Showable c = ( int x ) -> System.out.println("Yay! " + x );
        c.print(3);

        // Passing the object Showable to the method using and overriding with the Anonymous inner class technic
        display(new Showable()
        {
            @Override
            public void print( int x )
            {
                System.out.println("Yay! " + x );
            }
        });
    }
}
