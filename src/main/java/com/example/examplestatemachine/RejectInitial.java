package com.example.examplestatemachine;

public class RejectInitial extends State {

    StateContext sc;
    private final boolean accept;

    public RejectInitial(StateContext sc) {
        this.sc = sc;
        this.accept = false;
    }

    public void actionA() {
        sc.s = sc.aStateFromA;
    }

    public void actionB(){
        sc.s = sc.aStateFromB;
    }


    public boolean isAccept(){
        return this.accept;
    }

}
