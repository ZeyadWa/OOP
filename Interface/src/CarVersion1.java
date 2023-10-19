public class CarVersion1 implements Movable, SelfDrivable
{
    int x, y, numberOfPassengers;
    public  CarVersion1(){}
    public CarVersion1(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveLeft()
    {
        x--;
    }

    @Override
    public void moveRight()
    {
        x++;
    }

    @Override
    public void moveUp()
    {
        y++;
    }

    @Override
    public void moveDown()
    {
        y--;
    }

    @Override
    public void destination(String d)
    {
        System.out.println("Destination = " + d );
    }

    @Override
    public void drive()
    {
        System.out.println("Drive");
    }
}
