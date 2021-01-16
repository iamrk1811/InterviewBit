package ArraysQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindMissingAndRepeatingNumber {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xor = 0;
        for (int val: A) {
            xor ^= val;
        }
        for (int i = 1; i <= A.size(); i++) {
            xor ^= i;
        }

        int rsb = xor & -xor;

        int x = 0, y = 0;
        for (int val: A) {
            if ((val & rsb) == 0) x ^= val;
            else y ^= val; }

        for (int i = 1; i <= A.size(); i++) {
            if ((i & rsb) == 0) x ^= i;
            else y ^= i;
        }
        ArrayList<Integer> res = new ArrayList<>();
        boolean flag = false;
        for (int val: A) {
            if (x == val) flag = true;
        }

        if (flag) {
            res.add(x);
            res.add(y);
        } else {
            res.add(y);
            res.add(x);
        }
        return res;
    }
}
