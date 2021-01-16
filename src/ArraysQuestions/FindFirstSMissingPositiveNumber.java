package ArraysQuestions;

import java.util.ArrayList;

public class FindFirstSMissingPositiveNumber {
    public int solution1(ArrayList<Integer> A) {

        // for size 1
        if (A.size() == 1) if (A.get(0) < 0) return 1; else return A.get(0) + 1;

        int i = 0;
        while (i < A.size()) {
            // we only care about our positive number and should be less than A.size()
            if (A.get(i) > 0 && A.get(i) < A.size()) {
                int prev = A.get(i);
                int index = prev - 1;
                swap(A, i, index);

                if (A.get(i) == i + 1 || A.get(i) > A.size() || A.get(i) == prev)
                    i++;
            } else {
                i++;
            }
        }

        // find the missing number
        for (int j = 0; j < A.size(); j++) {
            if (A.get(j) != j + 1) return j + 1;
        }

        return A.size();


    }
    public void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
}
