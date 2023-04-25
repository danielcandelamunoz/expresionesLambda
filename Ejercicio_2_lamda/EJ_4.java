package Ejercicios.Ejercicio_2_lamda;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EJ_4 {
    public static void main(String[] args) {
        int [] n = {11,2,3,4,5,6,7,8,9,10};
        System.out.println(suma(n, n.length));
    }
    public static int suma(int [] n, int i){
        return Stream.iterate( 0, x->x+1).limit(n.length).map(x->n[x]).reduce(0, (a,b)->a+b);
    }
}
