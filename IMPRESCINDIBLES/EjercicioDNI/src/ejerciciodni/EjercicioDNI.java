/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodni;

import java.util.Scanner;

/**
 *
 * @author PROFESOR
 */
public class EjercicioDNI {
    static String [] tb = new String[23];
    /**
     * @param args the command line arguments
     */
    public static void cargarTabla(){
        tb[0]= "T";
        tb[1]= "R";
        tb[2]= "W";
        tb[3]= "A";
        tb[4]= "G";
        tb[5]= "M";
        tb[6]= "Y";
        tb[7]= "F";
        tb[8]= "P";
        tb[9]= "D";
        tb[10]= "X";
        tb[11]= "B";
        tb[12]= "N";
        tb[13]= "J";
        tb[14]= "Z";
        tb[15]= "S";
        tb[16]= "Q";
        tb[17]= "V";
        tb[18]= "H";
        tb[19]= "L";
        tb[20]= "C";
        tb[21]= "K";
        tb[22]= "E";
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        cargarTabla();
        System.out.println("Ejercicio DNI");
        System.out.println("=============\n");
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduzca DNI con formato válido: ");
        String cadena = dato.next();
        System.out.println("\n");
        long dni;
        int pos;
        dni=Long.parseLong(cadena.substring(0, cadena.length()-1));
        System.out.println("El dato numérico es: "+dni);
        pos=(int)dni%23;
        System.out.println("La letra del DNI es: "+tb[pos]);
        System.out.println("");
        if (tb[pos].equalsIgnoreCase(cadena.substring(cadena.length()-1, cadena.length()))){
            System.out.println("La letra está bien");
        }else{
            System.out.println("La letra está mal");
        }
        
    }
    
}
