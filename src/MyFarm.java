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
        totalCarrots();
        averageNumberOfPlants();
        numberOfTomatoPlots();
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
    public void totalCarrots() {
        // how many total carrot plants are there?
        int sumOfCarrots = 0;
        for (int h=0;h<grid.length;h++) {
            for (int k=0;k<grid[h].length;k++) {
                if (grid[h][k].plantName.equals("carrot")) {
                    sumOfCarrots += grid[h][k].numberOfPlants;
                }
            }
        }
        System.out.println("The total amount of carrots is " + sumOfCarrots + " carrots");
    }
    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole plot?
        int averagePlants = 0;
        for (int p=0;p<grid.length;p++) {
            for (int g=0;g<grid[p].length;g++) {
                averagePlants += (grid[p][g].numberOfPlants);
            }
        }
        System.out.println("The average of all the plants is " + averagePlants / (grid[0].length * grid.length));
    }
    public void numberOfTomatoPlots() {
        // how many plots have tomatoes on them?

    }
}
