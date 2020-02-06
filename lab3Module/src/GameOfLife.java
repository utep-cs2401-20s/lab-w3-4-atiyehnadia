package lab3;

public class GameOfLife {
    int size;
    int [][] board;
    int [][] previous;

    public GameOfLife (){
    }

    public GameOfLife(int s){
        size = s;
        board = new int[s][s];
        previous = new int[s][s];
    }

    public GameOfLife(int[][] a){
        size = a.length;
        board = new int[size][size];
        previous = new int[size][size];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length;j++){
                previous = a[i][j];
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public void oneStep(){
    }

    public void neighbors(int row, int col){

    }

    public  void evolution(int n){


    }

}
