package sample;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

public class TestSort {

    @Test
    public void testBubbleSort() {
        List<Integer> list = Arrays.asList(6, 4, 1, 3, 2, 5);
        IntStream.range(0, list.size()).forEach(i -> {
            IntStream.range(0, list.size() - 1 - i).forEach(j -> {
                if (list.get(j + 1) < list.get(j))
                   Collections.swap(list, j, j + 1);
            });
        });
        assertThat(list.toString(), is("[1, 2, 3, 4, 5, 6]"));
    }

    @Test
    public void testSelectionSort() {
        int[] array = { 6, 4, 1, 3, 2, 5 };
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        assertThat(Arrays.toString(array), is("[1, 2, 3, 4, 5, 6]"));
    }

    @Test
    public void testInsertionSort() {
        int[] array = { 6, 4, 1, 3, 2, 5 };

        for(int i = 1; i < array.length; i++){
            int insertionData = array[i];
            int j = i;
            for(; j >= 1 && array[j - 1] > insertionData; j--){
                array[j] = array[j - 1];
            }
            array[j] = insertionData;
        }
        assertThat(Arrays.toString(array), is("[1, 2, 3, 4, 5, 6]"));
    }
}
