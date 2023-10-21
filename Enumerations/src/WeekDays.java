public enum WeekDays
{
    SATURDAY("Working day") {
        @Override
        public void testMethod()
        {
            System.out.println("Saturday test Method");
        }
    }; // SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;

    private String status;
    WeekDays(){}
    WeekDays( String status )
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public abstract void testMethod();
}
