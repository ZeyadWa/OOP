public class Main
{
    public static void main(String[] args)
    {
        CarVersion1 c1 = new CarVersion1();
        c1.newFeature();

        Movable c2 = new CarVersion1();
        // But we Can't make an object from the Interface!

        System.out.println(Movable.x);
    }
}