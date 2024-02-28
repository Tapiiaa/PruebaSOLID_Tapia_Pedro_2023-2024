package Ejercicio1;

public class Calculadora {
    public static void main(String[] args) {

        //Creación de un objeto Matriz
        Matriz m = new Matriz(new int[][]{{1, 2}, {3, 4}});
        //Imprimir matriz original
        System.out.println("Matriz original");
            m.imprimirMatriz();
        System.out.println("------------------" );
        System.out.println("Matriz traspuesta");

        //Creación de un objeto MatrizTraspuesta
        MatrizTraspuesta mt = new MatrizTraspuesta(new int[][]{{1, 2}, {3, 4}});
        //Imprimir matriz traspuesta
            mt.trasponer();
            mt.imprimirMatriz();



    }
}
