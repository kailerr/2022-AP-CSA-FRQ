public class Data {
    public static final int MAX = 200;
    private int[][] grid;

    public Data(int[][] g) {
        grid = g;
    }
  
    public void repopulate() {
        int val = (int)(Math.random() * MAX) + 1;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                val = (int)(Math.random() * MAX) + 1;
                while (val % 100 == 0 && val % 10 != 0){
                    val = (int)(Math.random() * MAX) + 1;
                }
                grid[row][col] = val;
            }
            
        }
    }

   public void printGrid()
    {
        for(int row = 0;row < grid.length;row++)
        {
            for(int col = 0;col < grid.length;col++)
            {
                System.out.print(grid[row][col] + ",");
            }
            System.out.println();
        } 
    }

    public int countIncreasingCols() {
        int count = 0;

        for (int col = 0; col < grid[0].length; col++) {
            boolean decreasing = true; 
            for (int row = 0; row < grid.length-1; row++) {
                if (grid[row][col] > grid[row + 1][col]) 
                   decreasing = false;  
                }
                if (decreasing)
          count ++;
        }
          return count;
    }
}
