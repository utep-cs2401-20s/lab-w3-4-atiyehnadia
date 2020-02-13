//package lab3;

import java.util.Arrays;

public class TorusGameOfLife extends GameOfLife {
    public static void main (String [] args){
        int [][] array = {{0, 0, 0 ,0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        GameOfLife test1 = new GameOfLife(array);
        test1.evolution(4);
        //test1.neighbors(4,4);
        test1.printBoard();
    }

    public TorusGameOfLife(){
        super();

    }

    public TorusGameOfLife(int s){
        size = s;
        board = new int[s][s];
        previous = new int[s][s];

    }

    public static void main (String [] args){

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
                else{
                    tempArray[i][j] = dead;
                }
            }
        }
        previous = board;
        board = previous;
    }

    @Override
    public int neighbors(int row, int col){
        int aliveNeighbors = 0;
        int alive = 1;
        for(int i = row - 1; i <= row + 1; i++){
            for(int j = col -1; j<= col + 1; j++){
                if(board[i % size][j % size] == alive){
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
    public void printBoard(){
        for(int[] i : board){
            System.out.println(Arrays.toString(i));
        }
    }
}
