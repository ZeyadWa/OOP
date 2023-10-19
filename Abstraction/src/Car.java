public abstract class Car
{
    int numberOfWheels;
    float height;
    float weight;

    abstract void autoPilote();
    abstract void streamingServices();
    abstract void parkingSensors();

    public Car(){}

    public Car(int numberOfWheels, float height, float weight)
    {
        this.numberOfWheels = numberOfWheels;
        this.height = height;
        this.weight = weight;
    }

    public int getNumberOfWheels()
    {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels)
    {
        this.numberOfWheels = numberOfWheels;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }

    public float getWeight()
    {
        return weight;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }
}
