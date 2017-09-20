package com.rightpaw.spring.springbasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by alinawxn on 9/18/2017.
 */
@Component
@Qualifier("sort")
public class QuickSort implements SortAlgorith {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
