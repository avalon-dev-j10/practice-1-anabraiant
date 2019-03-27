package ru.avalon.java.dev.j10.labs.factories;


public class MathRandomMethod { //  определяет рандомное число в диапозоне 
    private int a; //от какого числа
    private int b; //до какого ( не включ) 

    public MathRandomMethod (int a, int b){
        this.a = a;
        this.b = b;
    }

    public int mathRandomMethod(){
        return (int)(a + Math.random()*b);
    }
}
