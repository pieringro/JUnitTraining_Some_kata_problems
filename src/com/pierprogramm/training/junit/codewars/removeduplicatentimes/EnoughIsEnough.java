package com.pierprogramm.training.junit.codewars.removeduplicatentimes;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* For example if N = 2,
* and the input is [1,2,3,1,2,1,2,3],
* you take [1,2,3,1,2],
* drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
*/
public class EnoughIsEnough {

    private static class ElementCounterTimes {
        Integer matchCounter = 1;
        int putCounter = 0;
    }


    public static int[] deleteNth(int[] list, int counter) {
        List<Integer> listOutput = new ArrayList<>();

        Map<Integer, ElementCounterTimes> map = getMapNumberTimes(list);
        for (Integer mapKey : list) {
            ElementCounterTimes elem = map.get(mapKey);
            if (elem.matchCounter <= counter) {
                listOutput.add(mapKey);
            } else {
                if (elem.putCounter < counter) {
                    listOutput.add(mapKey);
                    elem.putCounter++;
                }
            }
        }
        int[] arrayOutput = new int[listOutput.size()];
        int arrayIndex = 0;
        for (Integer listElem : listOutput) {
            arrayOutput[arrayIndex++] = listElem;
        }
        return arrayOutput;
    }


    private static Map<Integer, ElementCounterTimes> getMapNumberTimes(int[] list) {
        Map<Integer, ElementCounterTimes> mapOutput = new HashMap<>();
        for (int aList : list) {
            if (mapOutput.containsKey(aList)) {
                ElementCounterTimes elementCounterTimes = mapOutput.get(aList);
                elementCounterTimes.matchCounter++;
            } else {
                mapOutput.put(aList, new ElementCounterTimes());
            }
        }
        return mapOutput;
    }


}
