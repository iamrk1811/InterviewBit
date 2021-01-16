import java.util.ArrayList;
import ArraysQuestions.*;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();


        for (ArrayList<Integer> list: new PascalTriangle().solve(5)) {
            System.out.println(list);
        }
    }
}
