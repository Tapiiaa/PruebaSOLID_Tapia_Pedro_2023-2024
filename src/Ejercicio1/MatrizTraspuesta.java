package Ejercicio1;

public class MatrizTraspuesta extends Matriz{
    public MatrizTraspuesta(int matriz[][]) {
        super(matriz);
    }

    public void trasponer() {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int traspuesta[][] = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        matriz = traspuesta;              }

}
