package com.rightpaw.spring.springbasics.basic;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import org.springframework.stereotype.Service;

/**
 * Created by alinawxn on 9/18/2017.
 */
@Service
public class BubbleSort implements SortAlgorith {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
