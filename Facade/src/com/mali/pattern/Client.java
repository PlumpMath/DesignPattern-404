package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午2:18
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${外观模式提供了一个统一的接口，以便访问子系统的一群接口．
 *                  外观提供了高层接口，使得子系统更易使用}
 ******************************************************************************/
public class Client {
    public static void main(String[] args) {
        HomeModeFacadeInterface homeMode = new HomeMode();
        //　统一的外观接口
        // 不再需要与具体的子系统　door light 等进行一系列的交互了，直接通过外观提供的统一接口进行访问子系统接口
        homeMode.goHomeMode();
    }
}
