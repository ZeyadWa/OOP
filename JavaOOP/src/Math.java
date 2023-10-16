public class Math
{
    public int val;
    public Math(){}
    public Math( int val )
    {
        this.val = val;
    }

//    The first way of adding 2 object2:
//    static Math add( Math n1, Math n2 )
//    {
//        Math n3 = new Math();
//        n3.val = n1.val + n2.val;
//        return n3;
//    }

        // In main:
//    Math m1 = new Math(2);
//    Math m2 = new Math(5);
//    Math m3 = Math.add(m1, m2);
//    System.out.println(m3.val);

//    The 2nd way:
//    Math add( Math m2 )
//    {
//        Math m3 = new Math();
//        m3.val = this.val + m2.val;
//        return m3;
//    }
//
//    In main:
//    Math m1 = new Math(2);
//    Math m2 = new Math(5);
//    Math m3 = m1.add(m2);
//    System.out.println(m3.val);

//    How to compare between two objects?
//    boolean isEqual( Math m2 )
//    {
//        return ( this.val == m2.val );
//    }
//
//    In main:
//    Math m1 = new Math(2);
//    Math m2 = new Math(2);
//    System.out.println( m1.isEqual(m2) );
}
