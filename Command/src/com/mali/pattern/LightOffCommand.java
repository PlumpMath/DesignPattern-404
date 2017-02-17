package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午1:03
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class LightOffCommand implements CommandInteface {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute () {
        light.off();
    }

    @Override
    public void undo () {
        light.on();
    }

    @Override
    public String toString() {
        return "light on command";
    }
}
