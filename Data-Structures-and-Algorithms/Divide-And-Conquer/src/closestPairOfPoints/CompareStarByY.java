package closestPairOfPoints;

import java.util.Comparator;

public class CompareStarByY implements Comparator<Star> {


    @Override
    public int compare(Star o1, Star o2) {
        if(o1.getY_coordinate() == o2.getY_coordinate()) {
            return 0;
        } else if(o1.getY_coordinate() < o2.getY_coordinate()) {
            return -1;
        }

        return 1;
    }
}
