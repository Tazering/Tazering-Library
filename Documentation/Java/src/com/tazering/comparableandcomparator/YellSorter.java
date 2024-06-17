package com.tazering.comparableandcomparator;

import java.util.Comparator;

public class YellSorter implements Comparator<Rabbit> {

    @Override
    public int compare(Rabbit r1, Rabbit r2){

        if(r1.getScreamVolume() < r2.getScreamVolume()) {
            return -1;
        } else if(r1.getScreamVolume() > r2.getScreamVolume()) {
            return 1;
        }

        return 0;

    }

}
