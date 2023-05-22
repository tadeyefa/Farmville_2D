import java.util.ArrayList;

public class MyFarmArrayList {
    public ArrayList<Plot> row = new ArrayList<Plot>(); // array list
    public Plot[] bree = new Plot[10]; // array
    public MyFarmArrayList() {
        System.out.println("My farm using array list");

//        for (Plot a : row) {
//            System.out.println(row.size());
//            row.add(new Plot());
//            a.printPlot();
//        }

        for (int p=0;p<10;p++) {
            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();
        }
        row.add(new Plot());
        System.out.println(row.size());

//        row.remove(0);
//        row.add(new Plot());
//        row.add(new Plot());
//        row.add(new Plot());
//        System.out.println(row.size());
        totalPlants();
        printPlantNames();
        addSunflower();
        printPlantNames();
        addCorn();
        printPlantNames();
        tomatoLocations();
        totalCarrots();
        averageNumberOfPlants();
        numberOfCarrotPlots();
        numberOfEmptyPlots();
        everyOtherNeedsWater();
    }
    public void totalPlants() {
        // how many total plants are there in the row?
        int total = 0;
        for (Plot a : row) {
            total += a.numberOfPlants;
        }
        System.out.println("There are " + total + " plants in total");
    }
    public void printPlantNames() {
        // print the name of each plant in the row and its index
        for (int k=0;k<row.size();k++) {
            System.out.print(k + ": " + row.get(k).plantName + " \t");
        }
        System.out.println();
    }
    public void addSunflower() {
        // add a sunflower plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        Plot sunflower = new Plot();
        sunflower.plantName = "sunflower";
        sunflower.needsWater = true;
        sunflower.numberOfPlants = 42;
        row.add(sunflower);
        sunflower.printPlot();
    }
    public void addCorn() {
        // at index 3, add a new corn plot with 70 plants that do not need water
        // call printPlantNames() method before and after your addition to make sure it worked
        Plot corn = new Plot();
        corn.plantName = "corn";
        corn.numberOfPlants = 70;
        corn.needsWater = false;
        row.add(3, corn);
        corn.printPlot();
    }
    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
        for (int m=0;m<row.size();m++) {
            if (row.get(m).plantName.equals("tomato")) {
                System.out.println(m);
            }
        }
    }
    public void totalCarrots() {
        // how many total carrot plants are there?
        int carrots = 0;
        for (Plot c : row) {
            if (c.plantName.equals("carrot")) {
                carrots += c.numberOfPlants;
            }
        }
        System.out.println("There are " + carrots + " total carrots in the plot");
    }
    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        int average = 0;
        for (Plot g : row) {
            average += g.numberOfPlants;
        }
        System.out.println("There is an average of " + average/row.size() + " plants in this row");
    }
    public void numberOfCarrotPlots() {
        // how many plots have carrots on them
        // call printPlantNames() method to check
        int carrotPlots = 0;
        for (int t=0;t<row.size();t++) {
            if (row.get(t).plantName.equals("carrot")) {
                carrotPlots += 1;
            }
        }
        System.out.println("The total number of carrot plots is " + carrotPlots);
    }
    public void numberOfEmptyPlots() {
        // how many plots are empty
        // call printPlantNames() method to check
        int emptyPlots = 0;
        for (int e=0;e<row.size();e++) {
            if (row.get(e).plantName.equals("empty")) {
                emptyPlots += 1;
            }
        }
        System.out.println("The total number of empty plots is " + emptyPlots);
    }
    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot

    }
}
