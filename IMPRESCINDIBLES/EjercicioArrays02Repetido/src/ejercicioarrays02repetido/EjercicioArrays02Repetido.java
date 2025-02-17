package ejercicioarrays02repetido;

public class EjercicioArrays02Repetido {
    static String tb [][] = new String [5][3];
    static String tbDNI [] = new String [23];
    
    public static void main(String[] args) {
        cargarTabla();
        visualizarTabla("DATOS");
        separarNombres();
        System.out.println("\t\tHay " + contarGeneros() + " hombres y "
                + (tb.length - contarGeneros()) + " mujeres.\n");
        tablaDNI();
        System.out.println("\t\tLos DNIs que estan bien son: " + comprobarDNI());
        System.out.println("");
        ordenarDni();
    }
    
    public static void cargarTabla(){
        //carga la primera columna
        tb[0][0] = "54268967F";
        tb[1][0] = "41357894M";
        tb[2][0] = "24987536K";
        tb[3][0] = "45872647R";
        tb[4][0] = "65874129A";
        //carga la segunda columna
        tb[0][1] = "Carlos Soria";
        tb[1][1] = "Ernesto Sevilla";
        tb[2][1] = "Elsa Capuntas";
        tb[3][1] = "Mario Neta";
        tb[4][1] = "Susana Horia";
        //carga la tercera columna
        tb[0][2] = "hombre";
        tb[1][2] = "hombre";
        tb[2][2] = "mujer";
        tb[3][2] = "hombre";
        tb[4][2] = "mujer";
    }
    
    public static void visualizarTabla(String mensaje){
        System.out.println("\t\t===============");
        System.out.println("\t\t"+mensaje);
        System.out.println("\t\t===============");
        System.out.println("\t\tDNI"+"\t\t\tNombre Y Apellido" + "\tSexo");
        System.out.println("\t\t----------------------------------------"
                + "--------------");
        for (int i = 0; i < tb.length; i++) {
            for (int j = 0; j < tb[i].length; j++) {
                System.out.print("\t\t" + tb[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void separarNombres(){
        System.out.println("\t\t===============================================");
        System.out.println("\t\tVISUALIZACION DE NOMBRE Y APELLIDO POR SEPARADO");
        System.out.println("\t\t===============================================");
        
        String palabras[];
        for (int i = 0; i < tb.length; i++) {
            palabras = tb[i][1].split(" ");
            System.out.println("\t\tNombre: " + palabras[0] + "\t\tApellido: " + 
                    palabras[1]);
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static int contarGeneros(){
        int cont = 0;
        for (int i = 0; i < tb.length; i++) {
            if (tb[i][2].equalsIgnoreCase("HOMBRE")) {
                cont++;
            }
        }
        return cont;
    }
    
    public static void tablaDNI() {
        tbDNI[0] = "T";
        tbDNI[1] = "R";
        tbDNI[2] = "W";
        tbDNI[3] = "A";
        tbDNI[4] = "G";
        tbDNI[5] = "M";
        tbDNI[6] = "Y";
        tbDNI[7] = "F";
        tbDNI[8] = "P";
        tbDNI[9] = "D";
        tbDNI[10] = "X";
        tbDNI[11] = "B";
        tbDNI[12] = "N";
        tbDNI[13] = "J";
        tbDNI[14] = "Z";
        tbDNI[15] = "S";
        tbDNI[16] = "Q";
        tbDNI[17] = "V";
        tbDNI[18] = "H";
        tbDNI[19] = "L";
        tbDNI[20] = "C";
        tbDNI[21] = "K";
        tbDNI[22] = "E";
    }
    
    public static int comprobarDNI(){
        System.out.println("\t\t==============================");
        System.out.println("\t\tVISUALIZACION DE COMPROBAR DNI");
        System.out.println("\t\t==============================");
        long dni;
        int pos;
        int contar = 0;
        for (int i = 0; i < tb.length; i++) {
            dni = Long.parseLong(tb[i][0].substring(0,
                    tb[i][0].length() - 1));
            pos = (int) dni % 23;
            if (tbDNI[pos].equalsIgnoreCase(
                    tb[i][0].substring(tb[i][0].length() - 1,
                            tb[i][0].length()))) {
                contar++;
                System.out.println("\t\t"+tb[i][0]);
                System.out.println("");
            }
        }
        return contar;
    }
    
    public static void ordenarDni(){
        boolean ordenado = false;
        int cCambios = 0;
        while (!ordenado) {            
            cCambios = 0;
            for (int i = 0; i < tb.length - 1; i++) {
                if (tb[i][0].compareToIgnoreCase(tb[i + 1][0]) < 0) {
                    for (int j = 0; j < tb[i].length; j++) {
                        String temp = tb[i][j];
                        tb[i][j] = tb[i + 1][j];
                        tb[i + 1][j] = temp;
                    }
                    cCambios++;
                }
            }
            if (cCambios == 0) {
                ordenado = true;
            }
        }
        visualizarTabla("DATOS ORDENADOS");
    }
}
/*
int cambio = -1;
        while (cambio !=0) {
            cambio = 0;
            for (int i = 0; i < tb.length - 1; i++) {
                if (tb[i] < tb[i + 1]) {
                    int temp = tb[i];
                    tb[i] = tb[i + 1];
                    tb[i + 1] = temp;
                    cambio++;
                }
            }
        }
*/