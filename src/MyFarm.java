public class MyFarm {
    public static void main(String[] args) {
        MyFarm emily = new MyFarm();

    }
    public Plot[][] grid;
    public MyFarm() {
        System.out.println("Hello from my farm!");
        Plot leila = new Plot();
        leila.printPlot();

        grid = new Plot[4][3];

        for (int p=0;p<grid.length;p++) {
            for (int h=0;h<grid[p].length;h++) {
                grid[p][h] = new Plot();
                grid[p][h].printPlot();
            }
        }
        totalPlants();
    }
    public void totalPlants() {
        // how many total plants are there in the grid?
        System.out.println("There are " + (grid.length * grid.length) + " in the plot.");
    }

}
