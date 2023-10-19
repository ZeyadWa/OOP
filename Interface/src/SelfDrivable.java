public interface SelfDrivable
{
    void destination( String d );
    void drive();

    default void newFeature()
    {
        System.out.println("This is the new feature");
    }
}
