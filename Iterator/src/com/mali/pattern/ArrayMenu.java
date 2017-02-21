package com.mali.pattern;


import java.lang.*;
import java.util.*;


/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-20
 *  Time:    上午9:48
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ArrayMenu extends Menu{
    MenuItem[] menu;
    public ArrayMenu() {
        menu =  new MenuItem[10];
        menu[0] = new MenuItem("宫保鸡丁", 10);
        menu[1] = new MenuItem("红烧茄子", 9);
        menu[2] = new MenuItem("地三鲜", 12);
        menu[3] = new MenuItem("醋溜肥肠", 14);
    }

    public int menuSize() {
        return menu.length;
    }

    public Object getMenu (int i) {
        return menu[i];
    }

    @Override
    com.mali.pattern.Iterator getMenuIterator () {
        return new ArraMenuIterator(menu);
    }

    @Override
    public com.mali.pattern.Iterator iterator () {
        return new ArraMenuIterator(menu);
    }
}
