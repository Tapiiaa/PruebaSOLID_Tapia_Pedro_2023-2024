package Ejercicio1;

public class Matriz {

     int matriz[][];

    public Matriz(int matriz[][]) {
        this.matriz = matriz;
    }
    public void getMatriz(){
        this.matriz = matriz;
    }
    public void setMatriz(int matriz[][]){
        this.matriz = matriz;
    }
    public void imprimirMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }

    }

}
