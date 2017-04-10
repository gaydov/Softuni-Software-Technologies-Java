import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int biggestOccurence = 0;
        int mostFrequentNum = 0;

        for (int i = 0; i < nums.length; i++) {

            int currentNum = nums[i];
            int occurences = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (currentNum == nums[j]) {
                    occurences++;
                }
            }

            if (occurences > biggestOccurence) {
                biggestOccurence = occurences;
                mostFrequentNum = currentNum;
            }
        }
        System.out.println(mostFrequentNum);
    }
}
