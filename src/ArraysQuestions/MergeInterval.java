package ArraysQuestions;

import java.util.*;

public class MergeInterval {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start) return -1;
                else if (o1.start > o2.start) return 1;
                else return 0;
            }
        });
        Stack<Interval> stack = new Stack<>();
        stack.push(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            if (stack.peek().end >= intervals.get(i).start) {
//                merge possible
                Interval first = stack.pop();
                Interval second = intervals.get(i);

                Interval temp = new Interval();

                temp.start = first.start;
                temp.end = Math.max(first.end, second.end);

                stack.push(temp);
            } else {
                stack.push(intervals.get(i));
            }
        }

        intervals.clear();
        intervals.addAll(stack);
        return intervals;
    }
}
