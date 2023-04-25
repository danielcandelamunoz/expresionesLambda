package Ejercicios.Ejercicio_2_lamda;

import java.util.stream.Stream;

public class EJ_2 {
    public static void main(String[] args) {
        int num;
        num =10;
        System.out.print(fac(num));
    }
    public static int fac(int n){
        return Stream.iterate(1, x->x+1).limit(n).reduce(1, (x,y)-> x*y);
    }
}
