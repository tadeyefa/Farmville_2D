public class MyFarm {
    public static void main(String[] args) {
        MyFarm emily = new MyFarm();

    }
    public Plot[][] grid;
    public MyFarm() {
        System.out.println("Hello from my farm!");
        Plot leila = new Plot();
//        leila.printPlot();

        grid = new Plot[4][3];

        for (int p=0;p<grid.length;p++) {
            for (int h=0;h<grid[p].length;h++) {
                grid[p][h] = new Plot();
                grid[p][h].printPlot();
            }
        }
        totalPlants();
        printPlantNames();
    }
    public void totalPlants() {
        // how many total plants are there in the grid?
        int sumOfPlants = 0;
        for (int e=0;e<grid.length;e++) {
            for (int c=0;c<grid[e].length;c++) {
                sumOfPlants += grid[e][c].numberOfPlants;
            }
        }
        System.out.println(sumOfPlants);
    }
    public void printPlantNames() {
        // print the name of each plant in each row and column and its indexes
        for (int r=0;r<grid.length;r++) {
            for (int c=0;c<grid[r].length;c++) {
                System.out.println("row: " + r + " col: " + c + " " + grid[r][c].plantName);
            }
        }
    }
}
