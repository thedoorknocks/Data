public class Data {
    public static final int MAX = 100;
    private int[][] grid;

    public Data(int rows, int cols){
        grid = new int[rows][cols];
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                s += grid[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
    

    public void repopulate() {          
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int val = (int)(Math.random() * MAX + 1);
                while (val % 10 != 0 || val % 100 == 0) {
                    val = (int)(Math.random() * MAX + 1);
                }
                grid[i][j] = val;
            }
        }
    }


    public int countIncreasingCols() {
        int total = 0;
        for (int j = 0; j < grid[0].length; j++){ // loop over columns
            int countIncreasing = 0;
            for (int i = 0; i < grid.length - 1; i++){ 
                if (grid[i + 1][j] > grid[i][j]) {
                    countIncreasing++;
                }
            }
            if (countIncreasing == grid.length - 1){
                total++;
            }
        }
        return total;
    }
    
}