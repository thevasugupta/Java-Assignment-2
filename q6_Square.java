import java.util.function.Function;

public class q6_Square {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = q6_Square::square;
        int result = squareFunction.apply(5);
        System.out.println("Square: " + result);
    }
}
