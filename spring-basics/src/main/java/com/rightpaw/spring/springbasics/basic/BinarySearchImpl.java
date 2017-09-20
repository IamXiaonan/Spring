package com.rightpaw.spring.springbasics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by alinawxn on 9/18/2017.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("sort")
    private SortAlgorith sort;

    public int binarySearch(int[] array, int numberToSearch)
    {
        sort.sort(array);
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == numberToSearch)
                return i;
        }
        return -1;
    }
}
