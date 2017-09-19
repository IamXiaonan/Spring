package com.rightpaw.spring.springbasics;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by alinawxn on 9/18/2017.
 */
@Component
public class BubbleSort implements SortAlgorith {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
