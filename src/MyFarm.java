public class MyFarm {
    public static void main(String[] args) {
        MyFarm emily = new MyFarm();

    }
    public MyFarm() {
        System.out.println("Hello from my farm!");
        Plot leila = new Plot();
        leila.printPlot();

        Plot[][] grid = new Plot[10][10];

        for (int p=0;p<grid.length;p++) {
            for (int h=0;h<grid[p].length;h++) {
                grid[p][h] = new Plot();
                grid[p][h].printPlot();
            }
        }
    }

}
