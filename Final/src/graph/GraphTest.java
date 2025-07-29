package graph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    @Test // 1 point
    void testSingleComponentSmall(){
        Graph g = new Graph(4);
        Graph.createGraph(g, "graphs/SmallConnected.txt", false);
        assertTrue(g.numConnectedComponents() == 1);
    }

    @Test // 1 point
    void testMultipleComponentSmall(){
        Graph g = new Graph(4);
        Graph.createGraph(g, "graphs/SmallMultiple.txt", false);
        assertTrue(g.numConnectedComponents() == 2);
    }
}