public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot() {
//        plantName = "tulip";
        numberOfPlants = (int)(Math.random() * 100) + 10; // random numbers from 10-110 (non-inclusive)
        needsWater = true;

        int num = (int)(Math.random() * 5);
        if (num == 0) {
            plantName = "tulip";
        } else if (num == 1) {
            plantName = "rose";
        } else if (num == 2) {
            plantName = "daisy";
        } else if (num == 3) {
            plantName = "sunflower";
        } else if (num == 4) {
            plantName = "lily";
        }
    }
}
