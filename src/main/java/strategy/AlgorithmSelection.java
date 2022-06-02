package strategy;

import strategy.impl.SelectionSort;

public class AlgorithmSelection extends DoSort{

    public AlgorithmSelection(){
        sort = new SelectionSort();
    }
}
