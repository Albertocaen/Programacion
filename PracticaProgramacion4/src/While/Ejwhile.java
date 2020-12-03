package While;
import java.util.Scanner;
public class Ejwhile {
    public static void main(String[] args) {
        Programa();
    }
    public static void Programa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero;
        int ramdom = (int) (Math.random()*100)+1;
    do {
        numero = sc.nextInt();
    if ( numero== ramdom){
        System.out.println("Correcto");
    }else if (numero < ramdom){
        System.out.println("ingrese numero mayor");
    }else if (numero > ramdom){
        System.out.println("ingrese numero menor");
    }else if (numero <0 || numero > 100){
            System.out.println("Numero Ingresado Incorrecto");
        }
}while (  numero != 0 && numero != ramdom);
}
}