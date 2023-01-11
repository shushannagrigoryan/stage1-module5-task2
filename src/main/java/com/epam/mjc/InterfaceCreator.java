package com.epam.mjc;

import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        //throw new UnsupportedOperationException("You should implement this method.");
        return (List<Integer> list) -> {
            list.replaceAll(item -> item/divider);
            return list;
        };
    }
}
