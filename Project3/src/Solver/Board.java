package Solver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private int[][] tiles;
    // Define any additional attributes here
    public Board(int[][] initialTiles) {
        this.tiles = initialTiles;
        // Initialize any additional attributes here
    }

    /*
        Define and implement the required + helper methods here
     */

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int dim = tiles.length;
        for(int rowIdx = 0; rowIdx < dim; rowIdx ++) {
            for(int colIdx = 0; colIdx < dim; colIdx ++) {
                sb.append(tiles[rowIdx][colIdx]);
                if(colIdx < dim - 1) {
                    sb.append(",");
                }
            }
            if(rowIdx < dim - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
