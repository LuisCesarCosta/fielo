package br.com.fielo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MonkeyIslandTest {
    @Test
    public void testFindMaxPathScenery1Success() {
        int mat[][] = {{1, 3, 3}, {2, 1, 4}, {0, 6, 4}};
        Assertions.assertEquals(12, MonkeyIsland.findMaxPath(mat));
    }

    @Test
    public void testFindMaxPathScenery2Success() {
        int mat[][] = {{1, 3, 1, 5}, {2, 2, 4, 1}, {5, 0, 2, 3}, {0, 6, 1, 2}};
        Assertions.assertEquals(16, MonkeyIsland.findMaxPath(mat));
    }

    @Test
    public void testFindMaxPathScenery3Success() {
        int mat[][] = {{10, 33, 13, 15}, {22, 21, 04, 1}, {5, 0, 2, 3}, {0, 6, 14, 2}};
        Assertions.assertEquals(83, MonkeyIsland.findMaxPath(mat));
    }
}
