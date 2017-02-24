package com.mali.pattern;

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
public class MenuItem extends MenuComponent {
    private String name;
    private double price;
    private String description;
    private boolean vegetarian;

    public MenuItem(String name, double price, String description, boolean vegetarian) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.vegetarian = vegetarian;
    }
    @Override
    public String getName () {
        return this.name;
    }

    @Override
    public double getPrice () {
        return this.price;
    }

    @Override
    public String getDescription () {
        return this.description;
    }

    @Override
    public boolean isVergetarian () {
        return this.vegetarian;
    }

    @Override
    public Iterator<MenuComponent> createIterator () {
        return new NullIterator();
    }

    @Override
    public void print () {
        System.out.print("      菜名：" + this.getName() + "  ");
        if(this.isVergetarian()) {
            System.out.print("   *vegetarian*   ");
        }
        System.out.print("价格：" + this.getPrice() + "  ");
        System.out.print("描述：" + this.getDescription() + "  ");
        System.out.println("");
    }

}
