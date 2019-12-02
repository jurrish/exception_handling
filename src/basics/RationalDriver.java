package basics;

public class RationalDriver
{
    public static void main(String[] args)
    {
        try
        {
            Rational rational = new Rational(10, 0);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("blah");
            System.out.println(ex.getMessage());
        }
    }
}
