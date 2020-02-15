import java.util.Arrays;

public class TorusGameOfLife extends GameOfLife {
    public static void main (String [] args){
        int [][] array = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
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
        TorusGameOfLife test1 = new TorusGameOfLife(array);
        test1.evolution(14);
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
    public TorusGameOfLife(int[][] a){
        size = a.length;
        size2 = 0;
        for(int i = 0; i < a.length; i++){
            size2 = a[i].length;
        }

        board = new int[size][size2];
        previous = new int[size][size2];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length;j++) {
                previous[i][j] = a[i][j];
            }
        }
    }

    public void oneStep(){
        int alive = 1;
        int dead = 0;
        for(int i = 0; i < previous.length; i++) {
            for (int j = 0; j < previous[i].length; j++) {
                int neighbors = neighbors(i,j);
                if (previous[i][j] == dead && neighbors == 3) {
                    board[i][j] = alive;
                }
                if (previous[i][j] == alive && ((neighbors == 2) || (neighbors == 3))) {
                    board[i][j] = alive;
                } else if(previous[i][j] == alive && (neighbors > 3 || neighbors < 2)){
                    board[i][j] = dead;
                }
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }
    }


    @Override
    public int neighbors(int row, int col) {
        int aliveNeighbors = 0;
        int alive = 1;
        if (previous[(row + size)% size][((col - 1)+ size2) % size2] == alive) {
            aliveNeighbors++;
        }
        if (previous[(row + size) % size][((col+ 1) + size2) % size2] == alive) {
             aliveNeighbors++;
        }
        if (previous[((row - 1) + size) % size][(col + size2) % size2] == alive) {
            aliveNeighbors++;
        }
        if (previous[((row + 1) + size) % size][(col + size2) % size2] == alive) {
            aliveNeighbors++;
        }
        if (previous[((row - 1) + size) % size][((col - 1) + size2) % size2] == alive) {
            aliveNeighbors++;
        }
        if (previous[((row - 1)+ size) % size][((col + 1) + size2) % size2] == alive) {
            aliveNeighbors++;
        }
        if (previous[((row + 1) + size) % size][((col - 1) + size2) % size2] == alive) {
            aliveNeighbors++;
        }
        if (previous[((row + 1) + size) % size][((col + 1) + size2)  % size2] == alive) {
            aliveNeighbors++;
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
