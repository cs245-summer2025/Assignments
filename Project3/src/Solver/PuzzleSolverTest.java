package Solver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PuzzleSolverTest {

    public static boolean areNeighbors(Board prevState, Board nextState) {
        List<Board> neighbors = prevState.getNeighbors();
        for(Board n: neighbors) {
            if(n.equals(nextState)) {
                return true;
            }
        }
        return false;
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT1() {
        int numStepsToSolve = 4;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle04.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT1() {
        int numStepsToSolve = 4;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle04.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT2() {
        int numStepsToSolve = 8;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle08.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT2() {
        int numStepsToSolve = 8;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle08.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT3() {
        int numStepsToSolve = 14;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle14.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT3() {
        int numStepsToSolve = 14;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle14.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT4() {
        int numStepsToSolve = 7;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle07.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT4() {
        int numStepsToSolve = 7;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle07.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT5() {
        int numStepsToSolve = 12;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle12.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT5() {
        int numStepsToSolve = 12;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle12.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT6() {
        int numStepsToSolve = 11;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle11.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT6() {
        int numStepsToSolve = 11;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle11.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT7() {
        int numStepsToSolve = 32;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle32.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT7() {
        int numStepsToSolve = 32;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle32.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT8() {
        int numStepsToSolve = 28;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle28.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT8() {
        int numStepsToSolve = 28;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle28.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT9() {
        int numStepsToSolve = 36;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle36.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT9() {
        int numStepsToSolve = 36;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle36.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT10() {
        int numStepsToSolve = 47;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle47.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT10() {
        int numStepsToSolve = 47;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle47.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }

    @org.junit.jupiter.api.Test
    void testGetSolutionStepsT11() {
        int numStepsToSolve = 43;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle43.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        List<Board> steps = s.getSolutionSteps();

        assertTrue(steps.size() == numStepsToSolve + 1);

        // First board in the list must be the starting state
        assertTrue(steps.get(0).equals(startingBoard));

        // Last board in the list must be the goal state
        assertTrue(steps.get(numStepsToSolve).isGoal());

        // Check that each board in the sequence is the result of making only 1 move on the predecessor.
        for(int idx = 0; idx < numStepsToSolve; idx ++) {
            Board currentState = steps.get(idx);
            Board nextState = steps.get(idx + 1);
            assertTrue(areNeighbors(currentState, nextState));
        }
    }

    @org.junit.jupiter.api.Test
    void testGetNumMovesT11() {
        int numStepsToSolve = 43;
        Board startingBoard = PuzzleSolver.initializeBoard("data/puzzle43.txt");
        PuzzleSolver s = new PuzzleSolver(startingBoard);
        assertTrue(s.getNumMoves() == numStepsToSolve);
    }
}