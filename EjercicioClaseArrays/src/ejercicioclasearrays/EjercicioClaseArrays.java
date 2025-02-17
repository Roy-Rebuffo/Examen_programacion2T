/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclasearrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PROFESOR
 */
public class EjercicioClaseArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("EJERCICIOS CLASE ARRAYS\n\n\n");
        String cadena1="Roberto";
        String cadena2="Ana";
        System.out.println(cadena2.compareToIgnoreCase(cadena1));
        if(cadena2.compareToIgnoreCase(cadena1)>0){
            System.out.println(cadena2+" va por detrás de "+cadena1);
        }else if(cadena2.compareToIgnoreCase(cadena1)<0){
            System.out.println(cadena2+" va por delante de "+cadena1);
        }else{
            System.out.println("Son iguales");
        }*/

        menu();
    }
    
    public static void visualizarDatos(String texto,
            String tNombre[],int tNota[]){
        System.out.println("\n\n"+texto+":");
        System.out.println("\n\t NOMBRE\t      NOTA");
        System.out.println("\t ======\t      ====");
        for(int i=0;i<tNombre.length;i++){
            System.out.println("\t"+tNombre[i]+"\t\t"+tNota[i]);
        }
        System.out.println("\n\n");
    }
    
    public static void ordenarNombreAsc(String tNombre[],
            int tNota[]){//burbuja ascendente
        int cuentaintercambios=0; 
        for (boolean ordenado=false;!ordenado;){ 
            for (int i=0;i<tNombre.length-1;i++){ 
                if (tNombre[i].compareToIgnoreCase(tNombre[i+1])>0){
                    String variableString=tNombre[i];
                    int variableInt =tNota[i];
                    tNombre[i]=tNombre[i+1];
                    tNombre[i+1]=variableString;
                    tNota[i]=tNota[i+1];
                    tNota[i+1]=variableInt;
                    cuentaintercambios++;
                }
            }
            if (cuentaintercambios==0){
                    ordenado=true;
            }
            cuentaintercambios=0;
        }
        visualizarDatos("Tabla Ordenada por Nombres Ascendente",
                tNombre,tNota);
    }
    
    public static void ordenarNotaDesc(String tNombre[],
            int tNota[]){//burbuja descendente
        int cuentaintercambios=0; 
        for (boolean ordenado=false;!ordenado;){ 
            for (int i=0;i<tNombre.length-1;i++){ 
                if (tNota[i]<tNota[i+1]){
                    String variableString=tNombre[i];
                    int variableInt =tNota[i];
                    tNombre[i]=tNombre[i+1];
                    tNombre[i+1]=variableString;
                    tNota[i]=tNota[i+1];
                    tNota[i+1]=variableInt;
                    cuentaintercambios++;
                }
            }
            if (cuentaintercambios==0){
                    ordenado=true;
            }
            cuentaintercambios=0;
        }
        visualizarDatos("Tabla Ordenada por Notas Descendente",
                tNombre,tNota);
    }
    
    public static void aprobados(String tNombre[],
            int tNota[],int dimension){
        int dim=0;
        String aprNombre [] = new String[dimension];
        int aprNota[] = new int [dimension];
        for(int i=0;i<tNota.length;i++){
            if (tNota[i]>=5){
                aprNombre[dim]=tNombre[i];
                aprNota[dim]=tNota[i];
                dim++;
            }
        }
        visualizarDatos("Los aprobados son:",aprNombre,aprNota);
        
    }
    
    public static void suspensos(String tNombre[],
            int tNota[],int dimension){
        int dim=0;
        String susNombre [] = new String[dimension];
        int susNota[] = new int [dimension];
        for(int i=0;i<tNota.length;i++){
            if (tNota[i]<5){
                susNombre[dim]=tNombre[i];
                susNota[dim]=tNota[i];
                dim++;
            }
        }
        visualizarDatos("Los suspensos son:",susNombre,susNota);
    }
    
    public static void menu(){//procedimiento
        int opcion=-1;
        Scanner dato = new Scanner(System.in);
        int apr=0;
        int sus=0;
        //crear 2 arrays, tNombres y tNotas
        String [] tNombres = {"Antonio","Juan","Sofía","Sara",
            "Carlos","Mar","Roy","Diego","Carmen","Ana"};
        int tNotas [] = new int [10];        
        for(int i=0;i<tNotas.length;i++){
            tNotas[i]=alea(0,10);
        }
        
        while(opcion!=0){//estructura MIENTRAS
            System.out.println("MENÚ");
            System.out.println("====\n");
            System.out.println("\t(1) Ejercicio 1.- Visualizar Datos");
            System.out.println("\t(2) Ejercicio 2.- Ordenar Asc. por Nombres");
            System.out.println("\t(3) Ejercicio 3.- Ordenar Desc. por Notas");
            System.out.println("\t(4) Ejercicio 4.- Aprobados");
            System.out.println("\t(5) Ejercicio 5.- Suspensos");
            System.out.println("\t(6) Ejercicio 6.- Insertar Nombre y Nota");
            System.out.println("\t(7) Ejercicio 7.- Eliminar Nombre y Nota");
            System.out.println("\t(8) Ejercicio 8.- Modificar Datos");
            System.out.println("\t(9) Ejercicio 9.- Generar Clase");
            System.out.println("\t(0) SALIR");
            System.out.print("\nSeleccione la opción elegida: ");
            opcion=dato.nextInt();
            switch(opcion){//estructura CONDICIONAL MÚLTIPLE
                case 1:
                    visualizarDatos("Visualizar Datos",tNombres,tNotas);
                    break;
                case 2:
                    ordenarNombreAsc(tNombres,tNotas);
                    break;
                case 3:
                    ordenarNotaDesc(tNombres,tNotas);
                    break;
                case 4:
                    for(int i=0;i<tNotas.length;i++){
                        if (tNotas[i]>=5){
                            apr++;
                        }
                    }
                    aprobados(tNombres,tNotas,apr);
                    break;
                case 5:
                    for(int i=0;i<tNotas.length;i++){
                        if (tNotas[i]<5){
                            sus++;
                        }
                    }
                    suspensos(tNombres,tNotas,sus);
                    break;
                case 6:
                    //ejercicio_6(3);
                    break;
                case 7:
                    //ejercicio_7(4);
                    break;
                case 8:
                    //ejercicio_8(2);
                    break;
                case 9:
                    //ejercicio_9(2);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Elija un número entre 1 y 8");
                    //break;
            }
            for(int i=1;i<=3;i++){//estructura PARA
                System.out.println("");
            }
        }
    }
    public static int alea(int li, int ls){//función (método)
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
}
