package com.tazering.comparableandcomparator.practice;

import java.util.Comparator;

public class CompareByWinsLossesChamps implements Comparator<BasketBallTeam> {

    public int compare(BasketBallTeam a, BasketBallTeam b){

        //wins first
        if(a.getNumberOfWins() != b.getNumberOfWins()) {
            if(a.getNumberOfWins() > b.getNumberOfWins()) {
                return -1;
            } else if(a.getNumberOfWins() < b.getNumberOfLosses()) {
                return 1;
            }
        }

        //losses
        if(a.getNumberOfLosses() != b.getNumberOfLosses()) {
            if(a.getNumberOfLosses() > b.getNumberOfLosses()) {
                return 1;
            } else if(a.getNumberOfLosses() < b.getNumberOfLosses()) {
                return -1;
            }
        }

        //championships
        if(a.getNumberOfChampionships() == b.getNumberOfChampionships()) {
            if(a.getNumberOfChampionships() > b.getNumberOfChampionships()) {
                return -1;
            } else if(a.getNumberOfChampionships() < b.getNumberOfChampionships()) {
                return 1;
            }
        }

        return 0;

    }

}
