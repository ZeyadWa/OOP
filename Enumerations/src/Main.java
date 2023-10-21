import java.rmi.server.RemoteObjectInvocationHandler;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.EnumMap;
public class Main
{
    public static void main(String[] args)
    {
        System.out.print("1. ");
        System.out.println(WeekDays.SATURDAY.getStatus());

        System.out.print("2. ");
        WeekDays.SATURDAY.testMethod();

        // The ordinal() method returns the position of the enum constant
        System.out.print("3. ");
        System.out.println(Month.APRIL.ordinal());

        // The compareTo() method outputs first object index - second object index
        System.out.print("4. ");
        System.out.println(Month.JANUARY.compareTo(Month.DECEMBER));

        // toString() returns the name of the object enum as a string
        System.out.print("5. ");
        System.out.println(Month.SEPTEMBER.toString());

        // name() returns the name of the object enum as final
        System.out.print("6. ");
        System.out.println(Month.SEPTEMBER.name());

        // The valueOf() method tankes a string and returns an enum constant having the same string
        System.out.print("7. ");
        System.out.println(Month.valueOf("SEPTEMBER"));

        // The values() method returns an enum typed values
        System.out.print("8. ");
        for( Month M : Month.values() )
        {
            System.out.print(M + " ");
        }
        System.out.println();

        System.out.print("9. ");
        System.out.println(Arrays.toString(Month.values()));

        System.out.print("10. ");
        WeekDays day1 = WeekDays.SATURDAY;
        if( day1.equals(WeekDays.SATURDAY) )
            System.out.println("IsEqual Saturday");
        else
            System.out.println("NotEqual Saturday");

        System.out.print("11. ");
        EnumSet<Month> Months = EnumSet.of(Month.FEBRUARY);
        System.out.println(Months);

        System.out.print("12. ");
        Months = EnumSet.of(Month.FEBRUARY, Month.JUNE);
        System.out.println(Months);

        // EnumSet contains only unique Enum objects
        System.out.print("13. ");
        Months = EnumSet.of(Month.FEBRUARY, Month.FEBRUARY);
        System.out.println(Months);

        System.out.print("14. ");
        Months = EnumSet.allOf(Month.class);
        System.out.println(Months);

        System.out.print("15. ");
        Months = EnumSet.range(Month.FEBRUARY, Month.APRIL);
        System.out.println(Months);

        // noneOf() method makes the elements initially null
        System.out.print("16. ");
        Months = EnumSet.noneOf(Month.class);
        System.out.println(Months);

        System.out.print("17. ");
        Months.add(Month.NOVEMBER);
        System.out.println(Months);

        System.out.print("18. ");
        Months.remove(Month.NOVEMBER);
        System.out.println(Months);

        // key & value & the value is wrapper class!
        System.out.print("19. ");
        EnumMap<Month, String>testMap = new EnumMap<>(Month.class);
        testMap.put(Month.NOVEMBER, "My BirthDay");
        testMap.put(Month.JANUARY, "first term exams");
        System.out.println(testMap);

        System.out.print("20. ");
        System.out.println(testMap.get(Month.NOVEMBER));
    }
}