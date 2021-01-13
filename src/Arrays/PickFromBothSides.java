package Arrays;

import java.util.ArrayList;

public class PickFromBothSides {
    public int solution1(ArrayList<Integer> A, int B) {
//        calculate till target (B)
        int sumTillB = 0;
        for (int i = 0; i < B; i++) {
            sumTillB += A.get(i);
        }
        if (B == A.size())
            return sumTillB;

        int tempSum = sumTillB;
//        slide the window start subtracting from B-1 >= 0
//        and start adding from A.size() - 1
        for (int i = B - 1, j = A.size() - 1; i >= 0; i--, j--) {
            tempSum -= A.get(i);
            tempSum += A.get(j);
            sumTillB = Math.max(tempSum, sumTillB);
        }
        return sumTillB;
    }
}
