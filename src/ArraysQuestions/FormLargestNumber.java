package ArraysQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FormLargestNumber {
    public String solution1(ArrayList<Integer> A) {
//        Time - O(nlogn) Space - O(1)
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = String.valueOf(o1);
                String b = String.valueOf(o2);

                String ab = a + b;
                String ba = b + a;

                if (ab.compareTo(ba) > 0) {
                    return -1;
                } else {
                     return 1;
                }
            }
        });
        String res = "";
        for (Integer value: A) res += String.valueOf(value);

        if (res.charAt(0) == '0') return "0";

        return res;

    }

    public String solution2(ArrayList<Integer> A) {
//        Time - O(n^2) Space - O(1)
        int i = 0;
        while (i < A.size() - 1) {
            int j = i + 1;
            while (j < A.size()) {
                String a = String.valueOf(A.get(i));
                String b = String.valueOf(A.get(j));

                String ab = a + b;
                String ba = b + a;

                if (ab.compareTo(ba) < 0) {
                    swap(A, i , j);
                }
                j++;
            }
            i++;
        }

        String res = "";
        for (Integer value: A) res += String.valueOf(value);
        if (res.charAt(0) == '0') return "0";
        return res;
    }

    private void swap(ArrayList<Integer> A, int i, int j) {
        Integer temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
    public String solution3(ArrayList<Integer> a) {
//        Time - O(nlogn) Space - O(N) / O(1) /// FASTEST

        String[] arr = new String[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = String.valueOf(a.get(i));
        }


        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });


        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        if(sb.charAt(0) == '0'){     //check if all zeroes are there
            return String.valueOf(0);
        }

        return sb.toString();
    }
}
