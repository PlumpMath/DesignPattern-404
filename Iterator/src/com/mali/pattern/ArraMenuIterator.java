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
public class ArraMenuIterator implements com.mali.pattern.Iterator {
    private MenuItem[] menu;
    private int index = 0;
    public ArraMenuIterator(MenuItem[] menu) {
        this.menu = menu;
    }
    @Override
    public boolean hasNext () {
        return (menu.length > index && menu[index] != null);
    }

    @Override
    public MenuItem next () {
        return menu[index++];
    }

}
