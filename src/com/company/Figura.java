package com.company;

public abstract class Figura implements  Comparable<Figura>{
    //Una figura sera aquella que sea capaz de implementar una operación Area!!
    public  abstract double area();

    public int compareTo(Figura f) {
        return (int)(f.area()-this.area());
    }
}
