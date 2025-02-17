package copiasenjava;

import java.util.Arrays;

public class CopiasEnJava {
    public static void main(String[] args) {
        
        // 1. Usando clone() (copia de referencia en este caso)
        String original = "Hola";
        String copia = original;
        System.out.println("Original: " + original);
        System.out.println("Clon: " + copia);

        // 2. Usando System.arraycopy()
        String[] originalArray = {"Hola", "Mundo", "Java", "Copiar"};
        String[] destino = new String[3];
        System.arraycopy(originalArray, 1, destino, 0, 3);
        System.out.println("Destino (System.arraycopy): " + Arrays.toString(destino));

        // 3. Usando Arrays.copyOfRange()
        String[] copiaRango = Arrays.copyOfRange(originalArray, 1, 3);
        System.out.println("Copia (Arrays.copyOfRange): " + Arrays.toString(copiaRango));

        // 4. Usando Arrays.copyOf()
        String[] copiaCompleta = Arrays.copyOf(originalArray, 4);
        System.out.println("Copia (Arrays.copyOf): " + Arrays.toString(copiaCompleta));
    }
}