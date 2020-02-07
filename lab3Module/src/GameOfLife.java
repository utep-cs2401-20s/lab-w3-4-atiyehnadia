package lab3;

public class GameOfLife {
    int size;
    int [][] board;
    int [][] previous;

    public static void main (String [] args){
        System.out.print("Hello");
//        int [][] testArray = {{0,0,0,0,0},
//                {0,0,0,0,0},
//                {0,1,1,1,0},
//                {0,0,0,0,0},
//                {0,0,0,0,0}};
//        GameOfLife test1 = new GameOfLife(testArray);
//        test1.getBoard();
//        test1.neighbors(3,3);
//        test1.evolution();
//        test1.oneStep();
//        test1.convertArray(testArray);
//

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

//    public void convertArray(int[][] a){
//        for(int i = 0; i < a.length; i++){
//            for(int j = 0; j < a.length; j++){
//                if(a[i][j] == 0){
//                    System.out.println("*");
//                } else{
//                    System.out.println("!");
//                }
//            }
//        }
//    }

    public int[][] oneStep(){
        board = evolution();
        return board;
    }

    public int neighbors(int row, int col){
        int aliveNeighbors = 0;
        int dead = 0;
        int alive = 1;
        for(int i = row + 1; i <= row - 1; i++){
            for(int j = col + 1; j <= col - 1; j++){
                if(board[i][j] == alive && (row != i|| col != j)){
                    aliveNeighbors ++;
                }
            }
        }
        return aliveNeighbors;
    }

    public int [][] evolution(){
        int dead = 0;
        int alive = 0;
        for(int i = 0; i < size -1; i++){
            for(int j = 0; j < size -1; j++){
                int neighbors = neighbors(i,j);
                if(board[i][j] == alive){
                    if((neighbors < 2) || (neighbors > 3)){
                        previous[i][j]= dead;
                    }
                    else if((neighbors == 2) || (neighbors == 3)){
                        previous[i][j] = alive;
                    }
                }
                else if(board[i][j] == dead & neighbors == 3){
                    previous[i][j] = alive;
                }
            }
        }
        return previous;
    }

}


