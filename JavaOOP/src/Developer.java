public class Developer extends Employee
{
    String projectName;

    public Developer()
    {
        System.out.println("Child Class");
    }

    public Developer(String name, String email, String phone, String department, String address, int yearOfBirth, String projectName )
    {
        super( name, email, phone, department, address, yearOfBirth);
        this.projectName = projectName;
    }

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }
}
