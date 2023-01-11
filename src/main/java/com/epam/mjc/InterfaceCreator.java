package com.epam.mjc;

import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        try {
            return (List<Integer> list) -> {
                list.replaceAll(item -> item / divider);
                return list;
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new UnsupportedOperationException("You should implement this method.");
    }
}
