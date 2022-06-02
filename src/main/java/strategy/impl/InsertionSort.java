package strategy.impl;

import strategy.Sort;

import java.util.List;

public class InsertionSort implements Sort {

    @Override
    public List<Integer> sorts(List<Integer> array) {
        //Start from the second element.
        for(int i = 1; i < array.size();i++){

            //Go through the elements behind it.
            for(int j = i - 1; j > -1; j--){

                //value comparison using ascending order.
                if(array.get(j + 1) < array.get(j)){

                    //swap
                    int aux = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, aux);
                }
            }
        };

        return array;
    }
}
