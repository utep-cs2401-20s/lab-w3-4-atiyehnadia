package lab3;

public class GameOfLife {
    private int size;
    private int [][] board;
    private int [][] previous;

    public GameOfLife (){
    }

    public GameOfLife(int s){
        size = s;
    }

    public GameOfLife(int[][] b){
        board = b;
    }

//    public void setSize(int size) {
//        this.size = size;
//    }
//
//    public void setBoard(int[][] board) {
//        this.board = board;
//    }
//
//    public void setPrevious(int[][] previous) {
//        this.previous = previous;
//    }

    public int getSize() {
        return size;
    }

//    public int[][] getBoard() {
//        return board;
//    }
//
//    public int[][] getPrevious() {
//        return previous;
//    }

    public static void oneStep(){

    }

    public static void neighbors(int row, int col){

    }

    public static void evolution(int n){

    }

}
