package com.mali.pattern;

import java.util.List;

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
    private Menu arrayMenu;
    private Menu listMenu;
    public Waitress(Menu arrayMenu, Menu listMenu) {
        this.arrayMenu = arrayMenu;
        this.listMenu = listMenu;
    }
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

        Menu arrayMenu = new ArrayMenu();
        Menu listMenu = new ListMenu();
        //　以上每个都有menu都有自己的实现，需要根据各个menu的具体实现去遍历元素
        Waitress waitress = new Waitress(arrayMenu, listMenu);
        waitress.printMenu();
        //　以上方法中调用了两次printeMenu 而每次增加或减少Menu违法开放－关闭原则
        // 以下修改这种违反开放－关闭原则：
        // waitress将所有的menu放入到一个List中　先获得list的Iterator得到各个menu,再根据各个Menu的iterator遍历各个菜单
    }

    private void printMenu() {
        //　以下改由迭代器模式，不需要知道其具体实现
        com.mali.pattern.Iterator it1 = arrayMenu.getMenuIterator();
        // it1 it2本质上都是一样的，只不过it1与menu绑定，而it2使用额外的Iterable类来模拟java类库的实现方式
        com.mali.pattern.Iterator it2 = arrayMenu.iterator();
        com.mali.pattern.Iterator it = listMenu.getMenuIterator();
        printMenu(it);
        System.out.println("-------------");
        printMenu(it2);

    }

    private void printMenu(com.mali.pattern.Iterator it) {
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
