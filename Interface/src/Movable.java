public interface Movable
{
    int x = 10;
    void moveLeft();
    void moveRight();
    void moveUp();
    void moveDown();
    default void newFeatureK()
    {
        System.out.println("This is the new feature");
    }
}
