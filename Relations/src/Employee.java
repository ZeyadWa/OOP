public class Employee
{
    private int id;
    private float salary;
    private PersonalInformation personalInfo; // Composition relationship
    private Department dept; // Aggregation relationship

    public Employee(int id, float salary, String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth, Department dept)
    {
        this.id = id;
        this.salary = salary;
        this.personalInfo = new PersonalInformation( firstName, middleName, lastName, bloodGroup, accountNumber, nationality, yearOfBirth );
        this.dept = dept;
    }

    @Override // Polymorphism from the default class named "object"
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInfo=" + personalInfo +
                ", dept=" + dept +
                '}';
    }
}
