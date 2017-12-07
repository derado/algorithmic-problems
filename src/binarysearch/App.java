package binarysearch;

public class App {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 8, 9, 10, -3};

        Algorithm algorithm = new Algorithm(array);

        int result = algorithm.linearSearch(3);
        System.out.println(result);

        int[] array2 = {1, 3, 4, 7, 8, 9, 10};
        algorithm = new Algorithm(array2);

        result = algorithm.binarySearch(7);
        System.out.println(result);


    }

}
