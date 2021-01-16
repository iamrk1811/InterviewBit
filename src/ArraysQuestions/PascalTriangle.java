package ArraysQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);

        res.add(first);

        for (int i = 1; i < A; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                int val = res.get(i - 1).get(j-1) + res.get(i - 1).get(j);
                temp.add(val);
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}
