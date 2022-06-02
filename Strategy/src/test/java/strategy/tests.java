package strategy;

import org.junit.Test;
import strategy.impl.BubbleSort;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class tests {

    @Test
    public void arrayVazioBubbleSort(){
        DoSort bubble = new AlgorithmBubble();
        List<Integer> sorted = bubble.doSort(Arrays.asList());
        assertEquals(sorted, Arrays.asList());
    }

    @Test
    public void testBubbleSort(){
        DoSort bubble = new AlgorithmBubble();
        List<Integer> sorted = bubble.doSort(Arrays.asList(5,2,4,0));
        assertEquals(Arrays.asList(0,2,4,5), sorted);
    }

    @Test
    public void testInsertionSort(){
        DoSort insertion = new AlgorithmInsertion();
        List<Integer> sorted = insertion.doSort(Arrays.asList(5,2,4,0));
        assertEquals(Arrays.asList(0,2,4,5), sorted);
    }

    @Test
    public void testSelectionSort(){
        DoSort selection = new AlgorithmSelection();
        List<Integer> sorted = selection.doSort(Arrays.asList(5,2,4,0));
        assertEquals(Arrays.asList(0,2,4,5), sorted);
    }

}
