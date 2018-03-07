package com.example.examplestatemachine;

public class RejectFromB extends State {

    StateContext sc;
    private final boolean accept;

    public RejectFromB(StateContext sc){
        this.sc = sc;
        this.accept = false;
    }

    public void actionA() {
        sc.s = sc.aStateFromA;
    }

    public void actionB(){
        sc.s = sc.rStateFromB;
    }


    public boolean isAccept(){
        return this.accept;
    }

}
