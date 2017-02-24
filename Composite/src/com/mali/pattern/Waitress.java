package com.mali.pattern;

import java.util.Iterator;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-21
 *  Time:    下午5:07
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
    private MenuComponent allMenus;

    public Waitress (MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenus() {
        allMenus.print();
    }

    public void printVegetarian() {
        // 创建一个主菜单的迭代器　并将它作为参数传入到组合迭代器中
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        while(iterator.hasNext()) {
            MenuComponent menu = iterator.next();
            try {
                if (menu.isVergetarian()) {
                    System.out.println(menu.getName() + " " + menu.getPrice() + " " + menu.getDescription());
                }
            } catch(UnsupportedOperationException e) {
                System.out.println("||||||||||||||||||||||menu " + menu.getName() );
            }
        }
    }
    public static void main(String[] args) {
        MenuComponent mainMenu = new ActualMenu("主菜单", "这是饭店的主菜单");
        MenuComponent breakFirst = new ActualMenu("早餐","早餐菜单");
        MenuComponent launch = new ActualMenu("午餐","午餐菜单");
        MenuComponent dinner = new ActualMenu("晚餐","晚餐菜单");
        MenuComponent tiandian = new ActualMenu("甜点","甜点菜单");
        // tiandian.add(new MenuItem("奶油蛋糕", 5, "优良好奶", false));
        tiandian.add(new MenuItem("提拉米苏", 4, "优良好面粉", true));

        breakFirst.add(new MenuItem("小米粥",5, "香米制作",true));
        breakFirst.add(new MenuItem("油条", 2, "好面制作", true));
        breakFirst.add(new MenuItem("肉包", 3, "好肉制作",false));
        dinner.add(new MenuItem("肉包", 3, "好肉制作",false));
        dinner.add(tiandian);
//        mainMenu.add(breakFirst);
//        mainMenu.add(launch);
        mainMenu.add(dinner);
        Waitress waitress = new Waitress(mainMenu);
        // waitress.printMenus();
        // dinner.remove(tiandian);
        waitress.printMenus();
        System.out.println("///////////////////////////");
        waitress.printVegetarian();
    }
}
