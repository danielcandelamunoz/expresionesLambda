import java.util.*;
public class Todoslosmetodos{
public static int suma(int n){
    return Stream.iterate(0, x -> x+1).limit(n+1).reduce(0, (x,y)-> x+y);
}
public static int fac(int n){
    return Stream.iterate(1, x->x+1).limit(n).reduce(1, (x,y)-> x*y);
}
public static int potencia(int n, int m){
    return Stream.iterate(1, x-> x+1).limit(n).reduce(1,(x,y)->x*m);
}
public static int suma(int [] n, int i){
    return Stream.iterate( 0, x->x+1).limit(n.length).map(x->n[x]).reduce(0, (a,b)->a+b);
}
public static int media(int [] n, int i) {
    return Stream.iterate(0, x-> x+1).limit(n.length).map(x->n[x]).reduce(0, (a,b)->a+b);      
}
public static double media(double []n){
    return Stream.iterate(0, x-> x+1).limit(n.length).mapToDouble(x->n[x]).reduce(0, (a,b)->a+b)/n.length;
}
public static double varianza(double []n){
    double m = media(n);
    return Stream.iterate( 0, i->i+1).limit(n.length).mapToDouble(i->Math.pow(n[i]-m,2)).reduce(0, (c,d)->c+d)/n.length;
}
public static double Suma(int n) {
    return Stream.iterate(0, x->x+1).limit(n).filter(x->x%2==0).reduce(0,(a,b)->a+b);
        
}
public static double sumaPares(double []n ) {
    return Stream.iterate(0,x->x+1).limit(n.length).mapToDouble(x->n[x]).filter(x->x%2==0).reduce(0, (a,b)->a+b);
}
public static ArrayList lol(int [] n) {
    ArrayList listanueva=new ArrayList();
    return Stream.iterate(0, x->x+1).limit(n.length).map(x->n[x]).filter(x->x%2==0).collect(Collectors.toCollection(ArrayList::new));
    
}
public static ArrayList lol(int n) {
    return Stream.iterate(0, x->x+1).limit(n).filter(x->x%2==0).collect(Collectors.toCollection(ArrayList::new));
    
}

}