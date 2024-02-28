package Ejercicio1;

public class MatrizTraspuesta extends Matriz{
    //La clase MatrizTraspuesta hereda de la clase Matriz

    //Constructor:
    public MatrizTraspuesta(int matriz[][])
    {
        super(matriz); // Con el super se llama al constructor de la clase padre
    }
    //Métodos:
    public void trasponer() {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int traspuesta[][] = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        matriz = traspuesta;              } //Imprimimos la matriz traspuesta

}
