import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class GOLTester {

    /* TorusGameOfLife oneStep*/
    @Test
    public void testTGOLoneStep1(){
        int [][] A = {{0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0},
                      {0, 1, 1, 1, 0},
                      {0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.oneStep();
        int [][] expected = {{0, 0, 0, 0, 0},
                             {0, 0, 1, 0, 0},
                             {0, 0, 1, 0, 0},
                             {0, 0, 1, 0, 0},
                             {0, 0, 0, 0, 0}};
        assertArrayEquals(expected, sol.getBoard());
    }

    @Test
    public void testTGOLoneStep2(){
        int [][] A = {{0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0},
                      {0, 0, 1, 1, 1, 0},
                      {0, 1, 1, 1, 0, 0},
                      {0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.oneStep();
        int [][] expected = {{0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 1, 0, 0},
                             {0, 1, 0, 0, 1, 0},
                             {0, 1, 0, 0, 1, 0},
                             {0, 0, 1, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0}};
        assertArrayEquals(expected, sol.getBoard());
    }

    @Test
    public void testTGOLoneStep3(){
        int [][] A = {{0, 0, 0, 0, 0, 0},
                      {0, 1, 1, 0, 0, 0},
                      {0, 1, 1, 0, 0, 0},
                      {0, 0, 0, 1, 1, 0},
                      {0, 0, 0, 1, 1, 0},
                      {0, 0, 0, 0, 0, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.oneStep();
        int [][] expected = {{0, 0, 0, 0, 0, 0},
                             {0, 1, 1, 0, 0, 0},
                             {0, 1, 0, 0, 0, 0},
                             {0, 0, 0, 0, 1, 0},
                             {0, 0, 0, 1, 1, 0},
                             {0, 0, 0, 0, 0, 0}};
        assertArrayEquals(expected, sol.getBoard());
    }
    //edge case
        // test method with a non-square board
    @Test
    public void testTGOLoneStep4(){
        int [][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                      {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                      {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                      {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                      {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                      {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                      {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.oneStep();
        int [][] expected = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                             {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                             {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        assertArrayEquals(expected, sol.getBoard());
    }

    @Test
    public void testTGOLoneStep5(){
        int [][] A = {{0, 0, 1, 0},
                      {1, 0, 1, 0},
                      {0, 1, 1, 0},
                      {0, 0, 1, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.oneStep();
        int [][] expected = {{0, 0, 1, 0},
                             {0, 0, 1, 0},
                             {0, 0, 1, 0},
                             {0, 0, 1, 1}};;
        assertArrayEquals(expected, sol.getBoard());
    }

    /* TorusGameOfLife neighbors */
    @Test
    public void testTGOLneighbors1(){
        int [][] A = {{0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0},
                      {0, 1, 1, 1, 0},
                      {0, 0, 0, 0, 0},
                      {0, 0, 0, 0, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(2,sol.neighbors(2,2));
    }

    @Test
    public void testTGOLneighbors2(){
        int [][] A = {{1, 1, 1, 1, 1},
                      {1, 1, 1, 0, 0},
                      {0, 1, 1, 1, 0},
                      {0, 1, 1, 1, 0},
                      {1, 1, 1, 1, 1}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(8,sol.neighbors(0,1));
    }

    //edge case
        // Tests the methods ability to take the in numbers other that '1' or '0'
    @Test
    public void testTGOLneighbors3(){
        int [][] A = {{3, 2, 1, 0, 1, 0, 0, 0, 0},
                      {1, 1, 1, 0, 0, 3, 1, 1, 0},
                      {0, 1, 1, 1, 0, 1, 1, 4, 0},
                      {0, 1, 1, 1, 0, 3, 2, 1, 1},
                      {1, 1, 1, 1, 1, 0, 0, 0, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(3,sol.neighbors(4,0));
    }

    @Test
    public void testTGOLneighbors4(){
        int [][] A = {{0, 1, 1, 0},
                      {0, 0, 0, 0},
                      {0, 0, 0, 0},
                      {0, 0, 0, 0},
                      {0, 1, 1, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(3,sol.neighbors(0,1));
    }

    @Test
    public void testTGOLneighbors5(){
        // I made my array a heart to be all festive I hope y'all appreciate it
        int [][] A =
                {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                 {1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
                 {1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1},
                 {1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1},
                 {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                 {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                 {1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                 {1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
                 {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                 {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                 {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        assertEquals(2,sol.neighbors(7,7));
    }

    /* Evolution */
    @Test
    public void testTGOLevolution1(){
        int [][] A = {{0, 0, 0, 1},
                      {0, 0, 1, 0},
                      {0, 0, 1, 1},
                      {0, 1, 0, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.evolution(5);
        int[][] B = {{1, 0, 0, 1},
                     {0, 1, 0, 0},
                     {1, 0, 0, 1},
                     {0, 1, 0, 0}};
        assertArrayEquals(B, sol.getBoard());
    }

    // edge case
        // tests how evolution reacts to numbers others than '1' and '0', and how final array will look
    @Test
    public void testTGOLevolution2(){
        int [][] A = {{3, 2, 0, 1, 0, 5},
                      {0, 0, 1, 0, 0, 1},
                      {0, 0, 1, 1, 6, 1},
                      {0, 1, 0, 0, 1, 1},
                      {3, 2, 0, 1, 0, 5},
                      {3, 2, 0, 1, 0, 5}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.evolution(1);
        int[][] B = {{0, 0, 1, 1, 1, 0},
                     {0, 0, 1, 0, 0, 0},
                     {0, 1, 1, 1, 0, 1},
                     {1, 0, 0, 0, 0, 1},
                     {0, 0, 1, 1, 0, 0},
                     {0, 0, 1, 1, 1, 0}};
        assertArrayEquals(B, sol.getBoard());
    }
    @Test
    public void testTGOLevolution3(){
        int [][] A = {{1, 1, 1, 1, 1, 1},
                      {1, 0, 1, 0, 0, 1},
                      {1, 0, 1, 1, 1, 1},
                      {1, 1, 0, 0, 1, 1},
                      {1, 1, 0, 1, 0, 1},
                      {1, 1, 0, 1, 0, 1},
                      {1, 1, 1, 1, 1, 1}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.evolution(10000);
        int[][] B = {{0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0}};
        assertArrayEquals(B, sol.getBoard());
    }
    @Test
    public void testTGOLevolution4(){
        int [][] A = {{0, 0, 1, 0},
                      {1, 0, 1, 0},
                      {0, 1, 1, 0},
                      {0, 0, 1, 0}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.evolution(0);
        int [][] B = {{0, 0, 0, 0},
                      {0, 0, 0, 0},
                      {0, 0, 0, 0},
                      {0, 0, 0, 0}};
        assertArrayEquals(B, sol.getBoard());
    }
    @Test
    public void testTGOLevolution5(){
        int [][] A = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                      {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                      {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                      {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                      {1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
                      {1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1},
                      {1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1},
                      {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                      {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                      {1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                      {1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
                      {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                      {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        TorusGameOfLife sol = new TorusGameOfLife(A);
        sol.evolution(14);
        int[][] B = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        assertArrayEquals(B, sol.getBoard());
    }

}
