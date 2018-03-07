package com.example.examplestatemachine;

public class RejectFromA extends State
{
    StateContext sc;
    private final boolean accept;

    public RejectFromA(StateContext sc){
        this.sc = sc;
        this.accept = false;
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
