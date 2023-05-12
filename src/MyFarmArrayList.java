import java.util.ArrayList;

public class MyFarmArrayList {
    public ArrayList<Plot> row = new ArrayList<Plot>(); // array list
    public Plot[] bree = new Plot[10]; // array
    public MyFarmArrayList() {
        System.out.println("My farm using array list");
//        bree[0] = new Plot();
//        row.add(new Plot());

        for (int p=0;p<10;p++) {
            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();
        }
        row.add(new Plot());
        System.out.println(row.size());
    }
}
