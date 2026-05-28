public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int number = 10 / 0;   // Exception occurs here
            System.out.println(number);
        }

        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}