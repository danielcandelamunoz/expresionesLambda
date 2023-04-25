package Ejercicios.Ejercicio_2_lamda;

import java.util.stream.Stream;

import javax.swing.plaf.metal.MetalRadioButtonUI;

public class EJ_6 {
    public static void main(String[] args) {
        double [] n = {11,2,3,4,5,6,7,8,9,10};
        System.out.println(Math.sqrt(varianza(n)));
    }
    
    public static double media(double []n){
    return Stream.iterate(0, x-> x+1).limit(n.length).mapToDouble(x->n[x]).reduce(0, (a,b)->a+b)/n.length;
    }
    public static double varianza(double []n){
        double m = media(n);
        return Stream.iterate( 0, i->i+1).limit(n.length).mapToDouble(i->Math.pow(n[i]-m,2)).reduce(0, (c,d)->c+d)/n.length;
    }
     
        
    
}
