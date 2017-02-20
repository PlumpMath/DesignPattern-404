package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-20
 *  Time:    上午10:00
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ListStore extends Store{
    private ListMenu listMenu;
    public ListStore() {
        listMenu = new ListMenu();
    }
    public ListMenu getListMenu() {
        return listMenu;
    }
    @Override
    public com.mali.pattern.Iterator getMenuIterator () {
        return listMenu.iterator();
    }
}
