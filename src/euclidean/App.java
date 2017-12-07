package euclidean;

//Find the greatest common divisor (GCD)

public class App {

    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();

        int result = algorithm.gcdIterative(30, 100);
        System.out.println(result);

        result = algorithm.gcdRecursive(30, 10);
        System.out.println(result);

    }
}
