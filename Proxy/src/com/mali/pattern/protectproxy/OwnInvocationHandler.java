package com.mali.pattern.protectproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-27
 *  Time:    上午10:12
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class OwnInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnInvocationHandler (PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable{

            if (method.getName().equals("setRate")) { // 自己不能给自己评分
                System.out.println("不能给自己评分！！");
                // throw new IllegalAccessException();
                return null;
            } else {
                return method.invoke(person, args); //　其它操作可以,即可以给自己设置名字倪晨
            }
    }
}
