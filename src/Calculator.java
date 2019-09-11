class Application
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        int result = calculator.addAToB();
        System.out.println("Result of adding A to B is: " +result);

        Calculator calculator1 = new Calculator();
        int result1 = calculator1.deductBFromA();
        System.out.println("Result of substracting B from A is: " +result1);
    }
        }

public class Calculator {

    private int a = 10;
    private int b = 20;

    public int addAToB() {
        return a + b;
    }

    public int deductBFromA() {
        return b - a;
    }
}


