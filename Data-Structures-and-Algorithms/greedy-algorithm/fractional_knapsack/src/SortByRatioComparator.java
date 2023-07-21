import java.util.Comparator;

public class SortByRatioComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        if(o1.getRatio() == o2.getRatio()) {
            return 0;
        } else if(o1.getRatio() > o2.getRatio()) {
            return -1;
        } else {
            return 1;
        }
    }
}
