package com.mali.pattern;

import java.util.ArrayList;
import java.util.List;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午1:05
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${命令的调用者，它只需要针对CommandInterface接口发出execute命令，无需知道具体Command实例是谁,
 * 此外,具体的Command实例已经组合了实际的命令执行者，只需委托执行者执行即可}
 ******************************************************************************/
public class CommandInvoker {
    CommandInteface[] onCommand = new CommandInteface[7];
    CommandInteface[] offCommand = new CommandInteface[7];
    public CommandInvoker() {
        CommandInteface noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    public void setCommand(int slot, CommandInteface onCommand, CommandInteface offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;

    }

    public void pushOnButton(int slot) {
        this.onCommand[slot].execute();
    }

    public void pushOffButton(int slot) {
        this.offCommand[slot].execute();
    }

    public static void main(String[] args) {
        Light light = new Light();
        CommandInteface onCommand = new LightOnCommand(light);
        CommandInteface offCommand = new LightOffCommand(light);
        CommandInvoker invoker = new CommandInvoker();
        System.out.println(invoker);
        invoker.setCommand(0, onCommand, offCommand);
        System.out.println(invoker);
        invoker.pushOnButton(0);
        invoker.pushOffButton(0);

        invoker.pushOffButton(1);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < onCommand.length; i++) {
            builder.append("slot["+i+"] on command is " + onCommand[i] +", off command is " + offCommand[i] +"\n");
        }
        builder.append("\n");
        return builder.toString();
    }


}
