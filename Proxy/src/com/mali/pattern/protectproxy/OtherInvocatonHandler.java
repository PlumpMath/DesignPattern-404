package com.mali.pattern.protectproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-27
 *  Time:    上午10:18
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class OtherInvocatonHandler implements InvocationHandler {
    PersonBean person;

    public OtherInvocatonHandler (PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().equals("setName")) { //　不能给其它人设置名字
                System.out.println("不能给其他人设置名字！");
                // throw new IllegalAccessException();
                return null;
            } else {
                return method.invoke(person, args); //　可以给其它人评分
            }

    }
}
