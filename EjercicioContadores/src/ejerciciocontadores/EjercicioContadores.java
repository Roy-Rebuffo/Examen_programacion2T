/*
 * To change this license header, choose License Headers in 
Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocontadores;

//import java.util.Scanner;

import java.util.Scanner;


/* Para trabajar con librerías de Java (import)
Scanner: clase para introducir datos por teclado
*/


/**
 *
 * @author PROFESOR
 */
public class EjercicioContadores {
//variables globales: en cualquier lugar de la clase
    static Scanner dato = new Scanner(System.in);
    static int i;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables locales: solo en este método
        //int variable;
        /*        
        System.out.println("Hola"+"Mundo");
        System.out.println("Estoy haciendo JAVA");
        System.out.println("");
        System.out.print("Hola"+"\tMundo\n");
        System.out.print("Estoy haciendo JAVA\n");
        System.out.print("\n");
        System.out.printf("Hola Mundo\n");
        System.out.printf("Estoy haciendo JAVA\n");
        System.out.printf("\n");
        
        System.out.print("\nIntroduzca un dato: ");
        variable=dato.nextInt();
        System.out.println("Ha introducido el "+variable);
        System.out.print("Ha introducido el "+variable+"\n");
        System.out.printf("Ha introducido el %d\n",variable);
*/
        menu();
    }
    
    public static void menu(){//procedimiento
        int opcion=-1;
        while(opcion!=0){//estructura MIENTRAS
            System.out.println("MENÚ");
            System.out.println("====\n");
            System.out.println("\t(1) Ejercicio 1.-");
            System.out.println("\t(2) Ejercicio 2.-");
            System.out.println("\t(3) Ejercicio 3.-");
            System.out.println("\t(4) Ejercicio 4.-");
            System.out.println("\t(5) Ejercicio 5.-");
            System.out.println("\t(6) Ejercicio 6.-");
            System.out.println("\t(7) Ejercicio 7.-");
            System.out.println("\t(8) Ejercicio 8.-");
            System.out.println("\t(0) SALIR");
            System.out.print("\nSeleccione la opción elegida: ");
            opcion=dato.nextInt();
            switch(opcion){//estructura CONDICIONAL MÚLTIPLE
                case 1:
                    ejercicio_1();
                    break;
                case 2:
                    ejercicio_2(4);
                    break;
                case 3:
                    ejercicio_3();
                    break;
                case 4:
                    ejercicio_4();
                    break;
                case 5:
                    ejercicio_5();
                    break;
                case 6:
                    ejercicio_6(3);
                    break;
                case 7:
                    //ejercicio_7();
                    break;
                case 8:
                    //ejercicio_8();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Elija un número entre 1 y 8");
                    //break;
            }
            for(i=1;i<=3;i++){//estructura PARA
                System.out.println("");
            }
        }
    }
    
    public static void ejercicio_1(){
        int num;
        System.out.println("\n\n\tEJERCICIO 1");
        System.out.println("\t===========\n");
        System.out.print("Introduzca un número: ");
        num=dato.nextInt();
        if(num>0){
            System.out.println("\n\tEl número es positivo");
        }else if(num==0){
            System.out.println("\n\tEl número es cero");
        }else{
            System.out.println("\n\tEl número es negativo");
        }
    }
    
    public static void ejercicio_2(int veces){
        int num;
        int cPos=0;
        int cNeg=0;
        int cCer=0;
        int tNum=0;
        System.out.println("\n\n\tEJERCICIO 2");
        System.out.println("\t===========\n");
        for(i=1;i<=veces;i++){
            System.out.print("Introduzca el "+i+"º número: ");
            num=dato.nextInt();
            if(num>0){
                cPos++;
            }else if(num==0){
                cCer++;
            }else{
                cNeg++;
            }
            tNum+=num;
        }
        System.out.println("\n\n\tHay "+cPos+" positivos");
        System.out.println("\tHay "+cNeg+" negativos");
        System.out.println("\tHay "+cCer+" ceros");
        System.out.println("\tLa suma de todos es "+tNum+"\n");
    }
    
    public static void ejercicio_3(){
        int num;
        System.out.println("\n\n\tEJERCICIO 3");
        System.out.println("\t===========\n");
        System.out.print("Introduzca un número: ");
        num=dato.nextInt();
        for(i=1;i<=9;i++){
            System.out.println("\t"+num+" * "+i+" = "+(num*i));
        }
        System.out.println("");
    }
    
    public static void ejercicio_4(){
        int num;
        int j;
        System.out.println("\n\n\tEJERCICIO 4");
        System.out.println("\t===========\n");
        for(j=1;j<=10;j++){
            System.out.println("La tabla del "+j+" es:");
            for(i=1;i<=9;i++){
                System.out.println("\t"+j+" * "+i+" = "+(j*i));
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void ejercicio_5(){
        int cont=0;
        int suma=0;
        System.out.println("\n\n\tEJERCICIO 5");
        System.out.println("\t===========\n");
        System.out.println("Los múltiplos de 5 son:");
        for(i=5;i<=100;i+=5){
            cont++;
            suma+=i;
            System.out.println("\t"+i);
        }
        System.out.println("\nHay "+cont+" múltiplos de 5");
        System.out.println("La suma de los múltiplos de 5 es "+suma);
        System.out.println("");
    }
    public static void ejercicio_6(int veces){
        int num=0;
        System.out.println("\n\n\tEJERCICIO 6");
        System.out.println("\t===========\n");
        for(i=1;i<=veces;i++){
            System.out.print("Introduzca un número: ");
            num=dato.nextInt();
            while(num<1||num>50){
                System.out.print("Introduzca otro número entre 1 y 50: ");
                num=dato.nextInt();
            }
            System.out.println("Perteneca a la "+(((num-1)/10)+1)+"ª decena");
        }
        
    }





    
}
