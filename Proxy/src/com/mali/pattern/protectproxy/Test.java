package com.mali.pattern.protectproxy;

import java.lang.reflect.Proxy;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-27
 *  Time:    上午10:22
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class Test {
    public static void main(String args[]) {

        PersonBean person = new PersonBeanImpl("mali");
        PersonBean ownProxy = getOwnerProxy(person);
        PersonBean otherProxy = getOtherProxy(person);
        System.out.println(ownProxy.getName());
        ownProxy.setName("mali-test");
        System.out.println(ownProxy.getName());
        System.out.println(ownProxy.getRate());
        ownProxy.setRate(10);
        System.out.println(ownProxy.getRate());
        System.out.println("------------");
        System.out.println(otherProxy.getRate());
        otherProxy.setRate(10);
        System.out.println(ownProxy.getRate() + "\n-------------");
        System.out.println(otherProxy.getName());
        otherProxy.setName("test");
    }

    public static PersonBean getOwnerProxy (PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new OwnInvocationHandler(personBean));
    }

    public static PersonBean getOtherProxy (PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new OtherInvocatonHandler(personBean));
    }
}
