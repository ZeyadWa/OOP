public class Main
{
    public static void main(String[] args)
    {
        Department d1 = new Department(143, "X");

        Employee e1 = new Employee( 9773981, 10000, "Zeyad", "Waleed", "Hussein", "A+", "0777255555", "Egyption", 2003, d1 );
        // If we deleted the Employee, it doesn't seem like we are deleting his department information tho "Aggregation", but we are deleting his personal info "Composition"!

        System.out.println(e1);
    }
}