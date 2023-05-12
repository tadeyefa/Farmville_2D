public class MyFarm {
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
        numberOfEmptyPlots();
        everyOtherNeedsWater();
        plotWithMaxNumber();
        plantWithMaxNumber();
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
        int tomatoPlots = 0;
        for (int t=0;t<grid.length;t++) {
            for (int n=0;n<grid[t].length;n++) {
                if (grid[t][n].plantName.equals("tomato")) {
                    tomatoPlots += 1;
                }
            }
        }
        System.out.println("The number of tomato plots is " + tomatoPlots);
    }
    public void numberOfEmptyPlots() {
        // how many plots are empty?
        int emptyPlots = 0;
        for (int e=0;e<grid.length;e++) {
            for (int p=0;p<grid[e].length;p++) {
                if (grid[e][p].plantName.equals("empty")) {
                    emptyPlots += 1;
                }
            }
        }
        System.out.println("The number of empty plots is " + emptyPlots);
    }
    public void everyOtherNeedsWater() {
        // change the value of needsWater to be true for every other plot
        // print the value of needs water for all plots row by row
        for (int r=0;r<grid.length;r++) {
            for (int c=0;c<grid[r].length;c++) {
                if (c == 1) {
                    grid[r][c].needsWater = true;
                }
                System.out.println("row: " + r + " col: " + c + " needs water: " + grid[r][c].needsWater);
            }
        }
    }
    public void plotWithMaxNumber() {
        // which plot type has the most total plants?
        int maxNumber = grid[0][0].numberOfPlants;
        String name = grid[0][0].plantName;
        for (int b=0;b<grid.length;b++) {
            for (int g=0;g<grid[b].length;g++) {
                if (grid[b][g].numberOfPlants > maxNumber) {
                    maxNumber = grid[b][g].numberOfPlants;
                    name = grid[b][g].plantName;
                }
            }
        }
        System.out.println("The " + name + " plot has the most number of plants with " + maxNumber);
    }
    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        int numCorn = 0;
        int numTomato = 0;
        int numCarrot = 0;
        int numSunflower = 0;
        for (int b=0;b<grid.length;b++) {
            for (int g = 0; g < grid[b].length; g++) {
                switch (grid[b][g].plantName) {
                    case "corn":
                        numCorn += grid[b][g].numberOfPlants;
                        break;
                    case "tomato":
                        numTomato += grid[b][g].numberOfPlants;
                        break;
                    case "carrot":
                        numCarrot += grid[b][g].numberOfPlants;
                        break;
                    default:
                        numSunflower += grid[b][g].numberOfPlants;
                        break;
                }
            }
        }
        if (numCorn > numCarrot && numCorn > numSunflower && numCorn > numTomato) {
            System.out.println("Corn has the most total plants with " + numCorn);
        } if (numTomato > numCarrot && numTomato > numSunflower && numTomato > numCorn) {
            System.out.println("Tomato has the most total plants with " + numTomato);
        } if (numCarrot > numCorn && numCarrot > numSunflower && numCarrot > numTomato) {
            System.out.println("Carrot has the most total plants with " + numCarrot);
        } else {
            System.out.println("Sunflower has the most total plants with " + numSunflower);
        }
    }
}
