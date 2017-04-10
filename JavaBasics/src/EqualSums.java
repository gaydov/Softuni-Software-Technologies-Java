import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            index = i;

            for (int numLeft = 0; numLeft <= i - 1; numLeft++) {
                leftSum += nums[numLeft];
            }

            for (int numRight = i + 1; numRight < nums.length; numRight++) {
                rightSum += nums[numRight];
            }

            if (leftSum == rightSum) {
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }
}
