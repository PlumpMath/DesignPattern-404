package com.mali.pattern;

import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-20
 *  Time:    上午9:52
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ListMenu implements com.mali.pattern.Iterable {
    private List<MenuItem> menu;
    public ListMenu() {
        menu = new ArrayList<MenuItem>();
        menu.add(new MenuItem("清炒芥兰",13));
        menu.add(new MenuItem("炒青菜",10));
        menu.add(new MenuItem("韭菜鸡蛋",12));
    }

    public int menuSize() {
        return menu.size();
    }

    public MenuItem getMenu (int i) {
        return menu.get(i);
    }

    @Override
    public com.mali.pattern.Iterator iterator () {
        return new ListMenuIterator(menu);
    }
}
