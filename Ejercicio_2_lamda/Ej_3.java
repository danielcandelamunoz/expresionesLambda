package Ejercicios.Ejercicio_2_lamda;

import java.util.stream.Stream;

public class Ej_3 {
    public static void main(String[] args) {
        int num;
        num =5;
        int m;
        m=2;
        System.out.println(potencia(num,m ));
    }
    public static int potencia(int n, int m){
        return Stream.iterate(1, x-> x+1).limit(n).reduce(1,(x,y)->x*m);
    }
}
