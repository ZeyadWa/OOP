public class Main
{
    public static void main(String[] args)
    {
        // SUV car1 = new SUV();
        // System.out.println(car1.getHeight());

        // Even if we can't make an object of abstract class Car
        // We can apply the concept of Polymorphism as you can see!
        Car c1 = new Hatchback();
        c1.autoPilote();
    }
}