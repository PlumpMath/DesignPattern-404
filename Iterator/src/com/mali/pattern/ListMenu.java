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
public class ListMenu extends Menu {
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
    com.mali.pattern.Iterator getMenuIterator () {
        return new ListMenuIterator(menu);
    }
    //
    //上面和下面这个两个方法都是可替换的　　下面的一种实现相当于java的实现方式
    //
    @Override
    public com.mali.pattern.Iterator iterator () {
        // 可以使用List的自带Iterator方法 -> menu.iterator();
        return new ListMenuIterator(menu);
    }
}
