public class Account
{
    private int accountNumber;
    private String name;
    private float amount;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void insert( int accountNumber, String name, float amount )
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public void deposit( int amt )
    {
        System.out.println( amt + " deposited");
        this.amount += amt;
    }

    public void withDraw( int amt )
    {
        if( amt < this.amount )
        {
            System.out.println( amt + " withdrawn");
            this.amount -= amt;
        }
        else
            System.out.println("Can't withdraw this amount of money!");
    }

    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
