package Ejercicios.Ejercicio_2_lamda;

import java.util.stream.Stream;

public class EJ_7 {
    public static void main(String[] args) {
        int num;
        num =9;
        System.out.print(Suma(num));
    }
    public static double Suma(int n) {
        return Stream.iterate(0, x->x+1).limit(n).filter(x->x%2==0).reduce(0,(a,b)->a+b);
        
    }
}
