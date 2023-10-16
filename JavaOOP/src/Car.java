public class Car
{
    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    // Constructor Chaining
    public Car( String name, int maxSpeed )
    {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public Car(String name, int maxSpeed, float price)
    {
        this(name, maxSpeed);
        this.price = price;
    }

    // Copy Constructor

    public Car( Car obj )
    {
        this(obj.name, obj.maxSpeed, obj.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
