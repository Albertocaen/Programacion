import For.Ejfor;
import While.Ejwhile;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int opcion;
            /*Comentario agregado para git*/
            do {
                System.out.println("SELECCIONAR EL PROGRAMA QUE QUIERE EJECUTAR\n" +
                        "1.-EJERCICIO FOR\n" +
                        "2.-EJERCICIO WHILE\n" +
                        "3.-SALIR DEL MENU");
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        /*Comentario agregado para git*/
                        do {
                            System.out.println("1.-Rectangulo\n" +
                                    "2.-Retornar al Menu");
                            opcion=sc.nextInt();
                            switch (opcion){
                                case 1 -> Ejfor.Programa();
                                case 2 -> System.out.println("Retornor al menu");
                                default -> System.out.println("Retornar al menu");
                            }
                        }while (opcion != 2);
                        break;
                    case 2:
                        do {
                            System.out.println("1.-Juego de numeros\n" +
                                    "2.-Retornar al menu");
                            opcion = sc.nextInt();
                            switch (opcion){
                                case 1 -> Ejwhile.Programa();
                                case 2 -> System.out.println("Retornar al menu");
                                default -> System.out.println("Retorno al menu");
                            }
                        }while (opcion != 2);
                        break;
                    default:
                        System.out.println("Retorno al menu");
                        break;
                }
            }while (opcion !=3);

        } catch (Exception e) {
            System.out.println("Parametro Ingresado Incorrecto");
        }
    }
}
