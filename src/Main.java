import java.util.ArrayList;
import java.util.Arrays;

import ArraysQuestions.*;
public class Main {
    public static void main(String[] args) {
//        Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
//
//        Example 2:
//
//        Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
        ArrayList<Interval> list = new ArrayList<Interval>();
        list.add(new Interval(1,2));
        list.add(new Interval(3,5));
        list.add(new Interval(6,7));
        list.add(new Interval(8,10));
        list.add(new Interval(12,16));

        Interval it = new Interval(4,9);

        MergeInterval obj = new MergeInterval();
        ArrayList<Interval> res = obj.insert(list, it);

        System.out.println(res);


    }
}
