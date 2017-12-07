package quickselect;

public class App {

    public static void main(String[] args) {

        int[] nums = {1, 4, 5, 8, -2};

        Quickselect quickselect = new Quickselect(nums);

        System.out.println(quickselect.select(2));

    }

}
