package com.example.examplestatemachine;

public class AcceptFromB extends State {

    StateContext sc;
    private final boolean accept;

    public AcceptFromB(StateContext sc){
        this.sc = sc;
        this.accept = true;
    }

    public void actionA() {
        sc.s = sc.rStateFromA;
    }

    public void actionB(){
        sc.s = sc.aStateFromB;
    }


    public boolean isAccept(){
        return this.accept;
    }

}
