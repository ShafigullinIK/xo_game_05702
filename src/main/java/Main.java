import controller.MoveController;
import model.Field;
import model.Figure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Field f = new Field(10);
        //System.out.println(MoveController.whoseTurn(f));
        MoveController.makeMove(f, 4, 4);
        //System.out.println(MoveController.whoseTurn(f));
        MoveController.makeMove(f, 2, 1);
        //System.out.println(MoveController.whoseTurn(f));
        MoveController.makeMove(f, 2, 5);
        whoseTurn(f);
    }

    public static Figure whoseTurn(Field field) {
        int summa = 0;
        int[][] a = field.getFieldArr();

        Arrays.stream(a)
                .map(b -> Arrays.toString(b))
                .forEach(System.out::println);
        summa = Arrays.stream(a)
                .flatMapToInt(l -> Arrays.stream(l))
                .sum();

//        summa = Arrays.stream(a)
//                .map(arr -> summa(arr))
//                .reduce(0, (acc, x) -> x + acc);
//        summa = Arrays.stream(a)
//                .map(arr -> summa(arr))
//                .mapToInt(x -> x)
//                .sum();

        System.out.println(summa);
        return summa == 0 ? Figure.X : Figure.O;
    }

    public static int summa(int[] a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        return summa;
    }
}
