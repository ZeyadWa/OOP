public class Employee
{
    private String name, address, department, email;
    private float salary;
    public Employee(){}
    public Employee(String name, String address, String department, String email, float salary)
    {
        this.name = name;
        this.address = address;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static void print()
    {
        System.out.println("I am parent");
    }

    public void print2(){
        System.out.println("1");
    }
}
