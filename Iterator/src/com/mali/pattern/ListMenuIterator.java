package com.mali.pattern;

import java.util.*;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-20
 *  Time:    下午12:27
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ListMenuIterator implements com.mali.pattern.Iterator {
    private List<MenuItem> list;
    private int index;
    public ListMenuIterator(List list) {
        this.list = list;
        this.index = 0;
    }
    @Override
    public boolean hasNext () {
        return (list.size() > index && list.get(index) != null);
    }

    @Override
    public MenuItem next () {
        return list.get(index++);
    }

}
