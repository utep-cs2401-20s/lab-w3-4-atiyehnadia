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
        board = evolution()
    }

    public int neighbors(int row, int col){
        int neighbors = 0;
        int dead = 0;
        int alive = 1;
        for(int i = row - 1; i < row + 1; i++){
            for(int j = col - 1; j < col +1; j++){
                if(board[i][j] == alive && (row != i|| col != j)){
                    neighbors ++;
                }
            }
        }
        return neighbors;
    }

    public int [][] evolution(int n){
        int dead = 0;
        int alive = 1;
        for(int i = 1; i < n; i++){
            for(int j = 1; j< n; j++){
                int neighbors = neighbors(i,j);
                if(board[i][j] == alive){
                    if((neighbors < 2)) || (neighbors > 3)){
                        previous[i][j]= dead;
                    }
                    if((neighbors == 2) || (neighbors == 3)){
                        previous[i][j] = alive;
                    }
                }
                if(board[i][j] == dead & neighbors == 3){
                    previous[i][j] = alive;
                }
            }
        }
        return previous;
    }

}
