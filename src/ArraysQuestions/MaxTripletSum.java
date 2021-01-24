package ArraysQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class MaxTripletSum {
    public int solve(ArrayList<Integer> A) {
//        prefix sum right array
        int[] rightMax = new int[A.size()];
        rightMax[A.size() - 1] = A.get(A.size() - 1);
        for (int i = A.size() - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], A.get(i));
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(A.get(0));

        int max = Integer.MIN_VALUE;

        for (int i = 1; i < A.size() - 1; i++) {
            Integer leftValue = treeSet.lower(A.get(i));
            int currentValue = A.get(i);
            int rightValue = rightMax[i+1];

            if (leftValue != null && currentValue < rightValue) {
                max = Math.max(max, (leftValue + rightValue + currentValue));
            }
            treeSet.add(A.get(i));
        }
        if (max != Integer.MIN_VALUE)
            return max;
        return 0;
    }
}
