package LanguageSpecificsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FoldAndSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] inputNums = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = inputNums.length / 4;
        ArrayList<Integer> leftPart = new ArrayList<Integer>();
        ArrayList<Integer> rightPart = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) {
            leftPart.add(inputNums[i]);
        }
        Collections.reverse(leftPart);

        for (int i = inputNums.length - 1; i >= 3 * k; i--) {
            rightPart.add(inputNums[i]);
        }

        ArrayList<Integer> topRow = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            topRow.addAll(leftPart);
            topRow.addAll(rightPart);
        }
        ArrayList<Integer> bottomRow = new ArrayList<Integer>();
        for (int i = k; i < 3 * k; i++) {
            bottomRow.add(inputNums[i]);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < 2 * k; i++) {
            result.add(topRow.get(i) + bottomRow.get(i));
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
