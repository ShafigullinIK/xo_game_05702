import controller.MoveController;
import model.Field;

public class Main {
    public static void main(String[] args) {
        Field f = new Field(10);
        System.out.println(MoveController.whoseTurn(f));
        MoveController.makeMove(f, 4, 4);
        System.out.println(MoveController.whoseTurn(f));
        MoveController.makeMove(f, 4, 4);
        System.out.println(MoveController.whoseTurn(f));

    }

}
