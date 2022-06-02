package strategy;

import strategy.impl.InsertionSort;

public class AlgorithmInsertion extends DoSort{

    public AlgorithmInsertion(){
        sort = new InsertionSort();
    }
}
