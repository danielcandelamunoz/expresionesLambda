package Ejercicios.Ejercicio_2_lamda;

import java.util.Scanner;
import java.util.stream.Stream;

public class EJ_1 {
    public static void main(String[] args) {
        int num;
        num =9;
        System.out.print(suma(num));

    }
    public static int suma(int n){
        return Stream.iterate(0, x -> x+1).limit(n+1).reduce(0, (x,y)-> x+y);
    }
}
