package lab3;

public class GameOfLife {
    int size;
    int [][] board;
    int [][] previous;

    public static void main (String [] args){
        System.out.print("Hello");

    }

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
                previous[i][j] = a[i][j];
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public void oneStep(){
        int [][]tempArray = new int[size][size];
        int alive = 1;
        int dead = 0;
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - 1; j++){
                int neighbors = neighbors(i,j);
                if(board[i][j] == alive){
                    if((neighbors < 2) || (neighbors > 3)){
                        tempArray[i][j]= dead;
                    }
                    else if((neighbors == 2) || (neighbors == 3)){
                        tempArray[i][j] = alive;
                    }
                }
                else if(board[i][j] == dead && neighbors == 3){
                    tempArray[i][j] = alive;
                }
            }
        }
        previous = board;
        board = previous;
    }

    public int neighbors(int row, int col){
        int aliveNeighbors = 0;
        int alive = 1;
        for(int i = row - 1; i <= row + 1; i++){
            for(int j = col -1; j<= col + 1; j++){
                if(board[i][j]== alive && (i > 0 || j > 0) && (row != 0 || col !=0) &&(i != size || j != size)){
                    aliveNeighbors++;
                }
            }
        }
        return aliveNeighbors;
    }

    public void evolution(int n){
        while(n != 0){
            n--;
            oneStep();
        }
    }
}


