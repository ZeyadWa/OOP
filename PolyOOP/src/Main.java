public class Main
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Mohamed", "Amman", "IT", "Mo@gmail.com", 1000);
//        SalariedEmployee e2 = new SalariedEmployee("Mohamed", "Amman", "IT", "Mo@gmail.com", 1000, 200);
//        DailyEmployee e3 = new DailyEmployee("Mohamed", "Amman", "IT", "Mo@gmail.com", 1000, 60, 200);
//        System.out.println(e1.getSalary());
//        System.out.println(e2.getSalary());
//        System.out.println(e3.getSalary());

        // UpCasting
        System.out.println(e1.getSalary());
        e1 = new SalariedEmployee("Mohamed", "Amman", "IT", "Mo@gmail.com", 1000, 200);
        System.out.println(e1.getSalary());

        // We can't override a static method!
        Employee e2 = new SalariedEmployee("Mohamed", "Amman", "IT", "Mo@gmail.com", 1000, 200);
        e2.print();

        // polymorphic (generic) array type
        Employee [] e = new Employee[4];
        e[0] = new Employee();
        e[1] = new SalariedEmployee();
        e[2] = new DailyEmployee();
        e[3] = new HourlyEmployee();

        for( Employee i : e )
            i.print2();
    }
}