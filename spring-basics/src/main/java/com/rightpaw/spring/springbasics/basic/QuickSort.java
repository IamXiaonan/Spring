package com.rightpaw.spring.springbasics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import org.springframework.stereotype.Service;

/**
 * Created by alinawxn on 9/18/2017.
 */
@Service
@Qualifier("sort")
public class QuickSort implements SortAlgorith {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
