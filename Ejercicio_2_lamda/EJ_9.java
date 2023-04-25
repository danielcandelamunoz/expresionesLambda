package Ejercicios.Ejercicio_2_lamda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EJ_9 {
    public static void main(String[] args) {
        int [] n = {11,2,3,4,5,6,7,8,9,10};
        System.out.print(lol(n));
    }
    public static ArrayList lol(int [] n) {
        ArrayList listanueva=new ArrayList();
        return Stream.iterate(0, x->x+1).limit(n.length).map(x->n[x]).filter(x->x%2==0).collect(Collectors.toCollection(ArrayList::new));
        
    }
}
