public class Main
{
    public static void main( String[] args )
    {

        // This is an Anonymous inner class!
        RewardClass emp3 = new RewardClass()
        {
            @Override
            public void rewardMethod()
            {
                System.out.println("Your reward is $20");
            }
        };
        emp3.rewardMethod();


        //Other way to write it!
        new RewardClass(5)
        {
            @Override
            public void rewardMethod()
            {
                System.out.println("Your reward is $30");
            }
        }.rewardMethod();


        // We can Use the (var) keyword if we want to initialize an extra method inside the Anonymous inner class!
        var testTest = new RewardClass()
        {
            @Override
            public void rewardMethod()
            {
                System.out.println("Your reward is $30");
            }
            public void rewardMethod2()
            {
                System.out.println("Extra Class");
            }
        };
        testTest.rewardMethod2();
    }
}