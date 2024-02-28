package Ejercicio1;

public class Calculadora {
    public static void main(String[] args) {


        //Crear objetos "Matriz" y "MatrizTraspuesta"
        Matriz m = new Matriz(new int[][]{{1, 2}, {3, 4}});
        //Imprimir matriz original
        System.out.println("Matriz original");
        m.imprimirMatriz();
        System.out.println("------------------" );
        System.out.println("Matriz traspuesta");

        MatrizTraspuesta mt = new MatrizTraspuesta(new int[][]{{1, 2}, {3, 4}});
        //Imprimir matriz traspuesta
        mt.trasponer();
        mt.imprimirMatriz();



    }
}
