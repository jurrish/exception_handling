package basics;

public class Rational
{
    private double numerator;
    private double denominator;

    public Rational(double numerator, double denominator)
    {
        if(denominator == 0 )
        {
            System.out.println("bad denom");
            throw new ArithmeticException();
        }
        else
        {
            this.denominator = denominator;
        }
        this.numerator = numerator;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {

        if(denominator == 0)
        {
            System.out.println("same thing");
            throw new ArithmeticException();
        }
        else
        {
            this.denominator = denominator;
        }
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
