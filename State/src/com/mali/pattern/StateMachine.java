package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-24
 *  Time:    上午10:26
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${状态模式　允许对象在内部状态改变时改变它的行为,对象看起来好像修改了它的类}
 *
 *  通过将状态组合，不同的状态知道自己对应各种动作所需要进行的响应
 *  Context[stateMachine]所以只需将动作委托给当前的状态去执行
 ******************************************************************************/
public class StateMachine {

    private StateInterface state;
    private StateInterface hasNoMoneyState;
    private StateInterface hasMoneyState;
    private StateInterface soldState;
    private StateInterface soldOutState;
    private int counts;

    public int getCounts () {
        return counts;
    }

    public StateInterface getHasNoMoneyState () {
        return hasNoMoneyState;
    }

    public StateInterface getHasMoneyState () {
        return hasMoneyState;
    }

    public StateInterface getSoldState () {
        return soldState;
    }

    public StateInterface getSoldOutState () {
        return soldOutState;
    }

    public StateMachine (int productNum){
        this.counts = productNum;
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasMoneyState = new HasMoneyState(this);
        hasNoMoneyState = new HasNoMoneyState(this);
        if(counts > 0) {
            state = hasNoMoneyState;
        } else {
            state = soldOutState;
        }
    }

    public StateInterface getState () {
        return state;
    }

    public void setState (StateInterface state) {
        this.state = state;
    }

    public void releaseProduct () {
        System.out.println("release product!!!");
        counts--;
    }

    public void trunHandle() {
        state.turnHandle();
        state.dispense();
    }

    public void insertMoney() {
        state.insertMoney();
    }

    public void ejectMoney() {
        state.ejectMoney();
    }

    public void addProudct(int num) {
        counts+=num;
        if (state instanceof SoldOutState) {
            state = hasNoMoneyState;
        }
    }


    public static void main(String[] args) {
        StateMachine machine = new StateMachine(1);
        machine.trunHandle();
        System.out.println("=================");
        machine.insertMoney();
        machine.trunHandle();
        System.out.println("=================");
        machine.insertMoney();
        System.out.println("=================");
        machine.addProudct(2);
        machine.insertMoney();
        machine.ejectMoney();
        machine.insertMoney();
        machine.trunHandle();
        System.out.println("left " +machine.getCounts());
    }
}
