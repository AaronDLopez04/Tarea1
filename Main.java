package ico.fes.unam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre, profesión y tu país de origen: ");
        java.lang.String entrada = teclado.nextLine();
        java.lang.String[] separado = entrada.split(" ");

        String nombre = separado[0];
        String profesion = separado[1];
        String pais = separado[2];

            System.out.println("Nombre: " + (separado[0].toUpperCase()));
            System.out.println("Profesión: " + (separado[1].toUpperCase()));
            System.out.println("País: " + (separado[2].toUpperCase()));


    }
}
