public class Student
{
    private static int count = 1;
    private int id;
    private String name;
    private String password;
    private boolean loggedIn;
    private static String college = "IT";
    private static int minPassLength = 6;

    Student( String name, String password )
    {
        this.id = count++;
        this.name = name;
        if( validPass( password ) )
            this.password = password;
    }

    public static boolean validPass( String password )
    {
        if( password.length() >= minPassLength )
            return true;
        return false;
    }
}
