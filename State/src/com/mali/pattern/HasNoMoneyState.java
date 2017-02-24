package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-24
 *  Time:    上午10:21
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class HasNoMoneyState implements StateInterface {
    private StateMachine stateMachine;

    public HasNoMoneyState (StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertMoney () {
        System.out.println("insert money");
        stateMachine.setState(stateMachine.getHasMoneyState());
    }

    @Override
    public void ejectMoney () {
        System.out.println("insert moeny first");
    }

    @Override
    public void turnHandle () {
        System.out.println("turn handle but has no money");
    }

    @Override
    public void dispense () {
        System.out.println("should not dispense product, has no moeny");
    }
}
