import java.util.List;
import java.util.ArrayList;

public class Latihan1_CleanCode {
    public final static int STATUS_VALUE = 0;
    public final static int FLAGGED = 4;
    private static List<int[]> gameBoard = new ArrayList<>();

    public static List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }

    public static void main(String[] args) {
        gameBoard.add(new int[]{4, 1, 2});
        System.out.println("Program berjalan sukses setelah refactoring!");
        System.out.println("Jumlah sel bendera (Flagged): " + getFlaggedCells().size());
    }
}