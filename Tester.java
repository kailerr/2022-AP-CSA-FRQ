public class Tester {
    public static void main(String args[]) {
        int grid1[][] = new int[][]{{1,2,3},{1,5,6},{6,7,8}};
        Data population = new Data(grid1);

        population.printGrid();
        System.out.println(population.countIncreasingCols());
        population.repopulate();
        population.printGrid();

        
      
    }


}
