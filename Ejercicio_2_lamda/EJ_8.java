package Ejercicios.Ejercicio_2_lamda;

import java.util.Collection;
import java.util.stream.Stream;

public class EJ_8 {
    public static void main(String[] args) {
        double [] n = {11,2,3,4,5,6,7,8,9,10};
        System.out.print(sumaPares(n));
    }
    public static double sumaPares(double []n ) {
        return Stream.iterate(0,x->x+1).limit(n.length).mapToDouble(x->n[x]).filter(x->x%2==0).reduce(0, (a,b)->a+b);
        }
}
