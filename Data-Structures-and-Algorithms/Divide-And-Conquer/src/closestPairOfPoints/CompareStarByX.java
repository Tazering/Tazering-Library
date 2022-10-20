package closestPairOfPoints;

import java.util.Comparator;

public class CompareStarByX implements Comparator<Star> {


    @Override
    public int compare(Star o1, Star o2) {
        if(o1.getX_coordinate() == o2.getX_coordinate()) {
            return 0;
        } else if(o1.getX_coordinate() < o2.getX_coordinate()) {
            return -1;
        }

        return 1;
    }
}
