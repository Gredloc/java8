package cwiczenia;

public class Lambdas {
    public static void main(String[] args) {
        // f(x) -> x*x

        MathOperation addition = (a, b) -> a+b;
        MathOperation multiplication = (a, b) -> a*b;
        MathOperation division = (a, b) -> a/b;
        MathOperation subtraction = (a, b) -> a-b;

        double additionResult = executeOperation(3.0, 15.0, addition);
        System.out.println("Wynik operacji (a,b) -> a + b: " + additionResult);
        double mnozenieResult = executeOperation(100.50, 565.90, multiplication);
        System.out.println("Wynik operacji (a,b) -> a * b: " + mnozenieResult);
        double dzielenieResult = executeOperation(10.40, 55.80, division);
        System.out.println("Wynik operacji (a,b) -> a / b: " + dzielenieResult);
        double odejmowanieResult = executeOperation(27.80, 109.45, subtraction);
        System.out.println("Wynik operacji (a,b) -> a - b: " + odejmowanieResult);

    }
        static double executeOperation(double a, double b, MathOperation operation){
            double result = operation.operate(a, b);
            return result;
        }
    }

