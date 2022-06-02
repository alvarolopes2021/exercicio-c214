package strategy.impl;

import strategy.Sort;

import java.util.List;

public class SelectionSort implements Sort {
    @Override
    public List<Integer> sorts(List<Integer> array) {
        int min;

        //start passes.
        for (int i = 0; i < array.size(); i++) {
            //index of the smallest element to be the ith element.
            min = i;

            //Check through the rest of the array for a lesser element
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < array.get(min)) {
                    min = j;
                }
            }

            //compare the indexes
            if (min != i) {
                //swap
                int aux = array.get(min);
                array.set(min, array.get(i));
                array.set(i, aux);
            }
        }

        return array;
    }
}
