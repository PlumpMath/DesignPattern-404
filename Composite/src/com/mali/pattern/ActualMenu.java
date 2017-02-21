package com.mali.pattern;

import java.util.ArrayList;
import java.util.Iterator;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-21
 *  Time:    下午5:05
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ActualMenu extends MenuComponent {
    private String name;
    private String descriptioin;
    private ArrayList<MenuComponent> componentArrayList = new ArrayList<MenuComponent>();

    public ActualMenu (String name, String descriptioin) {
        this.name = name;
        this.descriptioin = descriptioin;
    }

    @Override
    public void add (MenuComponent component) {
        componentArrayList.add(component);
    }

    @Override
    public String getName () {
        return this.name;
    }

    @Override
    public void remove (MenuComponent component) {
        componentArrayList.remove(component);
    }

    @Override
    public String getDescription () {
        return this.descriptioin;
    }

    @Override
    public MenuComponent getChild (int i) {
        return componentArrayList.get(i);
    }

    @Override
    public void print () {
        System.out.println("菜单名：" + this.getName());
        System.out.println("描述　：" + this.getDescription());
        System.out.println("************************");
        Iterator<MenuComponent> it = componentArrayList.iterator();
        while(it.hasNext()) {
            it.next().print();
        }
        System.out.println("=======================");
    }
}
