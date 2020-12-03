package For;

import java.util.Scanner;

public class Ejfor {
    public static void main(String[] args) {
        Programa();
    }
    public static void Programa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int altura = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int base = sc.nextInt();
        System.out.println("Ingrese un signo");
        int au;
        String ingresar = sc.next();
        if (altura > base) {
            au = altura;
            altura = base;
            base = au;
        }
        for (int i = 0; i < altura; i++)
        {
            for (int j = 0; j < base; j++)
            {
                    System.out.print(ingresar);

            }
            System.out.println();
        }
    }}



