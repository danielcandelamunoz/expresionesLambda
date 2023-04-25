package Ejercicios.Ejercicio_2_lamda;

import java.util.stream.Stream;

public class EJ_5 {
    public static void main(String[] args) {
        int [] n = {11,2,3,4,5,6,7,8,9,10};
        System.out.println(media(n, n.length)/n.length);
    }
    public static int media(int [] n, int i) {
        return Stream.iterate(0, x-> x+1).limit(n.length).map(x->n[x]).reduce(0, (a,b)->a+b);      
    }
}
