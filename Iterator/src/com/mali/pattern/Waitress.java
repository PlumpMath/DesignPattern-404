package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-20
 *  Time:    上午10:01
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class Waitress {
    public static void main(String[] args) {
//        ArrayStore arrayStore = new ArrayStore();
//        ListStore listStore = new ListStore();
//        ArrayMenu arrayMenu= arrayStore.getArrayMenu();
//        ListMenu listMenu = listStore.getListMenu();
//        for(int i = 0; i < arrayMenu.menuSize(); i++) {
//            if (arrayMenu.getMenu(i) != null) {
//                System.out.println(arrayMenu.getMenu(i));
//            }
//        }
//        System.out.println("==============");
//        for(int i = 0; i < listMenu.menuSize(); i++) {
//            System.out.println(listMenu.getMenu(i));
//        }
        //　以上每个都有menu都有自己的实现，需要根据各个menu的具体实现去遍历元素
        //　以下改由迭代器模式，不需要知道其具体实现
        ListStore listStore = new ListStore();
        ArrayStore arrayStore = new ArrayStore();
        com.mali.pattern.Iterator it1 = arrayStore.getMenuIterator();
        com.mali.pattern.Iterator it = listStore.getMenuIterator();
        printMenu(it);
        System.out.println("-------------");
        printMenu(it1);
    }

    private static void printMenu(com.mali.pattern.Iterator it) {
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
