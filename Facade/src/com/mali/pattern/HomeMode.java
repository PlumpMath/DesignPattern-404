package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午2:00
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
public class HomeMode implements HomeModeFacadeInterface{
    //实际的门面实现，它与具体的子系统打交道，从而提供更加简单的对外服务接口
    private Door door = new Door();
    private Light light = new Light();
    private CdPlayer cdPlayer = new CdPlayer();
    private HotWaterMachine hotWaterMachine = new HotWaterMachine();

    @Override
    public void goHomeMode() { //这是暴露给对外的新的接口
        door.open();
        light.on();
        cdPlayer.playMusic();
        hotWaterMachine.boilWater();
    }
}
