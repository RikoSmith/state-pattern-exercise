package com.example.examplestatemachine;

public class StateContext {

    State aStateFromA;
    State aStateFromB;
    State rStateFromA;
    State rStateFromB;
    State rInitial;
    State s;

    public StateContext(){
        this.aStateFromA = new AcceptFromA(this);
        this.aStateFromB = new AcceptFromB(this);
        this.rStateFromA = new RejectFromA(this);
        this.rStateFromB = new RejectFromB(this);
        this.rInitial = new RejectInitial(this);
        s = rInitial;
    }

    public void actionA(){
        s.actionA();
    }

    public void actionB(){
        s.actionB();
    }

    public boolean isAccept(){
        return s.isAccept();
    }

}
