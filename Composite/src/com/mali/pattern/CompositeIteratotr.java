package com.mali.pattern;

import java.util.Iterator;
import java.util.Stack;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-21
 *  Time:    下午6:15
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class CompositeIteratotr implements Iterator<MenuComponent> {

    private Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIteratotr (Iterator<MenuComponent> it) {
        stack.push(it);
    }

    @Override
    public boolean hasNext () {
        if (stack.isEmpty()) { // 堆栈为空　没有元素
            return false;
        } else {
            Iterator<MenuComponent> it = stack.peek(); //　否者peek一个看看它有没有元素
            if (it.hasNext()) { // peek的有，返回真
                return true;
            } else {
                stack.pop(); //　peek的没有需要将这个出栈,然后递归地看堆栈中是否海域哦其它元素
                return hasNext(); // 递归调用看是否还有其它
            }
        }
    }

    @Override
    public MenuComponent next () {
        if (hasNext()) {
            Iterator<MenuComponent> it = stack.peek();
            MenuComponent menu = it.next();
            if (menu instanceof ActualMenu) {
                stack.push(menu.createIterator());
            }
            return menu;
        } else {
            return null;
        }
    }

    @Override
    public void remove () {
        throw new UnsupportedOperationException();
    }
}
