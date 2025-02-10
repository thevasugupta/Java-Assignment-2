public class q7_ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        //try - catch
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException (in try-catch): " + e.getMessage());
        }

        // Try-catch-finally block
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException (in try-catch-finally): " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
    }
