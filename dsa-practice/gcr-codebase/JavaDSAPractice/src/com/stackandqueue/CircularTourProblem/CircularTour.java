package com.stackandqueue.CircularTourProblem;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {

    public static int findStart(PetrolPump[] pumps) {

        Queue<Integer> queue = new LinkedList<>();
        int surplus = 0;
        int start = 0;

        for (int i = 0; i < pumps.length; i++) {

            surplus += pumps[i].petrol - pumps[i].distance;
            queue.add(i);

            // If surplus goes negative, reset
            while (surplus < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                surplus -= pumps[removed].petrol - pumps[removed].distance;
                start = removed + 1;
            }
        }

        return surplus >= 0 ? start : -1;
    }
}