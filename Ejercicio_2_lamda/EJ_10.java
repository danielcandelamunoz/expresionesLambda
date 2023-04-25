package Ejercicios.Ejercicio_2_lamda;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class EJ_10 {
    public static void main(String[] args) {
        int num =9;
        System.out.println(lol(num));
    }
    public static ArrayList lol(int n) {
        return Stream.iterate(0, x->x+1).limit(n).filter(x->x%2==0).collect(Collectors.toCollection(ArrayList::new));
        
    }
}

