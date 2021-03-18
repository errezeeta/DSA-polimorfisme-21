package com.company;

public class Quadrat extends Rectangle{

    public Quadrat(double l){
        super(l,l);
    }

    @Override
    public String toString() {return "||Quadrat [costat: " + this.getL1()+ "] area: "+super.area()+"||";}
}
