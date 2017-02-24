package com.mali.pattern;

import java.util.Iterator;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-21
 *  Time:    下午5:00
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public abstract class MenuComponent {

    /***对于菜单的操作方法***/
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    /***对于菜单项的操作方法***/
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public boolean isVergetarian() {
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> createIterator () {
        throw new UnsupportedOperationException();
    }
}
