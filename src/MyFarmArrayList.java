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
    }
    public void totalPlants() {
        // how many total plants are there in the row?
        int total = 0;
        for (Plot a : row) {
            total += a.numberOfPlants;
        }
        System.out.println("There are " + total + " plants in total");
    }
}
