package org.example;

public class myMathLukin {
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;
    //1
    public int minus(int number) {
        return - number;
    }
    public  double minus(double number){
        return - number;
    }
    public float minus(float number){
        return  - number;
    }
    public  long minus(long number){
        return - number;
    }
    //2
    public double cotang(int angle){
        return  0;
    }
    public  double arkcotang(int angle){
        return 0;
    }
    public double finalRoundLength(int radius){
        return 0;
    }
    public  int showSimpLeNumber(int start, int end){
        return  0;
    }
    //3
    public double sqrt(double number){
        double tg;
        double squareRoot = number / 2;
        do {
            tg = squareRoot;
            squareRoot = (tg+(number/tg))/2;
        }
    while ( (tg-squareRoot)!=0);
    return  squareRoot;
    }

    }
