import java.util.Scanner;

public class MaxSeqIncrElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int startPos = 0;
        int bestStartPos = 0;
        int length = 1;
        int biggestLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                length++;

                if (length == 2) {
                    startPos = i - 1;
                }

                if (length > biggestLength) {
                    biggestLength = length;
                    bestStartPos = startPos;
                }
            } else {
                length = 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = bestStartPos; i < (bestStartPos + biggestLength); i++) {
            sb.append(nums[i] + " ");
        }
        System.out.println(sb.toString());
    }
}
