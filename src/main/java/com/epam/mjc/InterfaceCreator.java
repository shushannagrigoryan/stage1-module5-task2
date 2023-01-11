package com.epam.mjc;

import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        Operation<Integer> op = (List<Integer> list) -> {
            for(int item:list) item = item / divider;
            return list;
        };
        throw new UnsupportedOperationException("You should implement this method.");

    }
}
