package com.example.examplestatemachine;

public class AcceptFromA extends State {

    StateContext sc;
    private final boolean accept;

    public AcceptFromA(StateContext sc){
        this.sc = sc;
        this.accept = true;
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
