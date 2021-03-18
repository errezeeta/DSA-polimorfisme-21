package com.company;

public class Hexagono extends Figura {
    private double lado;

    public Hexagono(double l){
        this.lado= l;
    }

    public double area() {
        //El area de un hexagono es 6*((L^2 * √3)/4)
        //nose hacer calculos tan chungos en java asi que tiro de mil variables ':)
        double un= Math.pow(this.lado,2);
        double dos= Math.sqrt(3);
        double tre= un*dos;
        double quat= tre/4;
        return 6*quat;
    }
    @Override
    public String toString() {return "||Hexagon [costat: " +this.lado+ "] area: " +this.area()+"||";}
}
