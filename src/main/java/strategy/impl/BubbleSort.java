package strategy.impl;

import strategy.Sort;
import java.util.List;

public class BubbleSort implements Sort {

    @Override
    public List<Integer> sorts(List<Integer> array) {
        //Outer pass
        for(int i = 0; i < array.size(); i++){

            //Inner pass
            for(int j = 0; j < array.size() - i - 1; j++){

                //Value comparison using ascending order

                if(array.get(j + 1) < array.get(j)){

                    //Swapping
                    int aux = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, aux);
                }
            }
        }
        return array;
    }
}
