
package ejercicioarraycadenasrepe;

import java.util.Scanner;

public class EjercicioArrayCadenasRepe {

    
    public static void main(String[] args) {
        /*
        Introducir una cadena de texto y una palabra a reemplazar.
        Introducir otra palabra que sustituirá a la anterior en la cadena.
        Mostrar la cadena modificada.
        */
        Scanner dato = new Scanner(System.in);
        String cadena;
        String palabra;
        String palabraNueva;
        String vocales = "AEIOU";
        System.out.print("Introduzca una cadena: ");
        cadena = dato.nextLine();
        
        System.out.print("Introduzca una palabra de la cadena que"
                + " quieras sustituir");
        palabra = dato.nextLine();
        
        System.out.println("Introduzca la nueva palabra: ");
        palabraNueva = dato.nextLine();
        
        if (cadena.contains(palabra)) {
            cadena = cadena.replace(palabra, palabraNueva);
            System.out.println(cadena);
        }
        
        /*
        Introducir una cadena y un número ‘n’.
        Mostrar todas las palabras de la cadena que tengan más de ‘n’ caracteres.
        */
        System.out.print("Introduzca una cadena: ");
        cadena = dato.nextLine();
        
        System.out.print("Introduzca un numero: ");
        int n = dato.nextInt();
        dato.nextLine();
        
        String [] nuevaCadena = cadena.split(" ");
        
        System.out.println("Las palabras con mas de " + n + "caracteres son : ");
        boolean encontrado = false;
        for (String elem : nuevaCadena) {
            if (elem.length() > n) {
                System.out.println(elem);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existen palabras con " + n + "caracteres");
        }
        
        /*
        Introducir una cadena de texto.
        Mostrar solo los caracteres en posiciones pares, pero en mayúscula.
        */
        
        System.out.print("Introduzca una cadena: ");
        cadena = dato.nextLine();
        
        System.out.println("Los caracteres en posiciones pares son: ");
        for (int i = 0; i < cadena.length(); i+=2) {
            System.out.println(Character.toUpperCase(cadena.charAt(i)));
        }
        System.out.println();  
        
        /*
        Introducir una cadena y mostrar sus palabras en orden inverso.
        */
         System.out.print("Introduzca una cadena: ");
        cadena = dato.nextLine();

        System.out.println("La cadena en orden inverso caracter a caracter es: ");
        for (int i = cadena.length() -1 ; i >= 0; i--) {
            System.out.println(cadena.charAt(i));
        }
        
        String[] palabrasInversas = cadena.split(" ");
        System.out.println("La cadena en orden inverso por palabras es: ");
        for (int i = palabrasInversas.length - 1; i >= 0; i--) {
            System.out.println(palabrasInversas[i] + " ");
        }
        /*
        Introducir una cadena y contar cuántas vocales contiene en total.
        */
        System.out.print("Introduzca una cadena para averiguar sus vocales: ");
        cadena = dato.nextLine().toUpperCase();
        int cont = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.contains(String.valueOf(cadena.charAt(i)))) {
                cont++;
            }
        }
        System.out.println("Numero total de vocales en la cadena: " + cont);
    }
    
}
