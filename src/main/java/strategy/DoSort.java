package strategy;

import java.util.List;

public abstract class DoSort {

    protected Sort sort;

    public List<Integer> doSort(List<Integer> array){
        return sort.sorts(array);
    }
}
