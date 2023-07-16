public class Item {

    private int weight;
    private int value;
    private double ratio;
    private int index;

    public Item(int weight, int value, int index) {
        this.weight = weight;
        this.value = value;
        this.index = index;
        this.ratio = ((double) (value)) / weight;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public void printItem() {
        System.out.println("Item weight: " + this.weight + "\tItem value: " + this.value);
        System.out.println("Ratio: " + this.ratio);
    }
}
