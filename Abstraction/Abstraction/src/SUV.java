public class SUV extends Car
{
    int testVariable;

    public SUV( int testVariable, int numberOfWheels,  float height, float weight )
    {
        super( numberOfWheels, height, weight );
        this.testVariable = testVariable;
    }
    @Override
    void autoPilote()
    {
        System.out.println(" SUV autoPilote ");
    }

    @Override
    void streamingServices()
    {
        System.out.println( "SUV streamingServices" );
    }

    @Override
    void parkingSensors()
    {
        System.out.println( "SUV parkingSensors" );
    }
}
