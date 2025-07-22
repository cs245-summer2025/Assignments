package Solver;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class PuzzleSolver {

    Board startingBoard;
    // Define any additional attributes here

    public PuzzleSolver(Board b) {
        this.startingBoard = b;
        // Initialize any additional attributes here
    }

    /*
        Define and implement the required + helper methods here.
     */

    /*
        Method to initialize the puzzle. Do not delete this method.
     */
    public static Board initializeBoard(String filename) {
        Scanner br;
        try {
            br = new Scanner(new FileReader(filename));
            int boardDimension = br.nextInt();
            int[][] blocks = new int[boardDimension][boardDimension];
            for (int row = 0; row < boardDimension; row++)
                for (int col = 0; col < boardDimension; col++)
                    blocks[row][col] = br.nextInt();
            Board initial = new Board(blocks);
            return initial;
        } catch(IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
