import Arrays.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(-1);
        a.add(100);
        a.add(3);
        a.add(2);
        a.add(1);

        PickFromBothSides obj = new PickFromBothSides();
        System.out.println(obj.solution1(a, 3));

    }
}
