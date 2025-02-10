import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String msg) {
        super(msg);
    }
}
public class q10_Throw_Throws {
    public static int factorial(int n) throws NegativeException {
        if (n<0){
            throw new NegativeException("Negative Number");
        }
        int result = 1;
        for (int i = 1; i<=n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Input number:");
            int number = scanner.nextInt();
            System.out.println("Factorial of "+number+": "+factorial(number));
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
}
