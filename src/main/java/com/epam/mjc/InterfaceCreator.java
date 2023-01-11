package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {


        return (List<Integer> list) -> {
            List<Integer> newList = new ArrayList<>(list);

            newList.replaceAll(item -> item / divider);
            return newList;
        };

        //throw new UnsupportedOperationException("You should implement this method.");
    }
}
