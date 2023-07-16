import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Item[] items = new Item[3];
        items[0] = new Item(18, 25, 0);
        items[1] = new Item(15, 24, 1);
        items[2] = new Item(10, 15, 2);

        int weight = 20;
        int n = 3;
        double[] output = new double[n];

        Arrays.sort(items, new SortByRatioComparator());

        for(int i = 0; i < items.length; i++) {
            double count = 0;

            while(weight > 0) {
                if(weight / items[i].getWeight() >= 1) {
                    weight -= items[i].getWeight();
                    count += 1;
                } else {
                    count = ((double) weight) / (items[i].getWeight());
                    weight = 0;
                }



                break;

            }

            output[items[i].getIndex()] = count;
        }

        printArray(output);

    }

    public static void printArray(double[] arr) {
        for(double i : arr) {
            System.out.print(i + "\t");
        }
    }

}
