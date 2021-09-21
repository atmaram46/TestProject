package test.com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calC = new Calculator(new CalculatorService());
        System.out.println(calC.perform(2, 10));
    }
}
