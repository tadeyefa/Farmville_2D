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

}
