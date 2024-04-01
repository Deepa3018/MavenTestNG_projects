import org.testng.annotations.Test;

public class Third
{
    @Test(priority = 1)
    void animal()

    {
        System.out.println("This is animal class");
    }

    @Test (priority = 2)
    void vehicle()
    {
        System.out.println("This is vehicle class");
    }
    @Test(priority = 3)
    void iteration()

    {
        System.out.println("This is iteration class");
    }

}
