package Ejercicio1;

public class Matriz {
    //Declaración de variables:

    int matriz[][];

    //Constructor:
    public Matriz(int matriz[][]) {
        this.matriz = matriz;
    }
    //Métodos:
    public void getMatriz(){
        this.matriz = matriz;
    }
    public void setMatriz(int matriz[][]){
        this.matriz = matriz;
    }
   //Este método imprimirá la matriz normal.
    public void imprimirMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }

    }

}
