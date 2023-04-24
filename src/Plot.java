public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot() {
//        plantName = "tulip";
        numberOfPlants = (int)(Math.random() * 100) + 10; // random numbers from 10-110 (non-inclusive)
        needsWater = false;

        int num = (int)(Math.random() * 5);
        if (num == 0) {
            plantName = "sunflower";
        } else if (num == 1) {
            plantName = "carrot";
        } else if (num == 2) {
            plantName = "tomato";
        } else if (num == 3) {
            plantName = "corn";
        } else {
            plantName = "empty";
            numberOfPlants = 0;
        }
    }

    public void printPlot() {
        System.out.println("The " + plantName + " plot has " + numberOfPlants + " and it is " + needsWater + " that it needs water.");
    }
}
