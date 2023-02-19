
public class Matrix {
    public static void main(String[] args){
    
    
    }
    public int[][] multiplicarMatrices(int matrizResultado[][], int matriz[][], int matriz2[][]) {
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j<matriz2[0].length; j++){
                for (int k = 0; k <matriz[0].length; k++){  
                    matrizResultado[i][j] += matriz[i][k] * matriz2[k][j]; 
                }
            }
        }
        return matrizResultado;
    }
    public int[][] llenarMatriz(int matriz[][], int inicio, int fin){
        for(int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = inicio + (int)(Math.random()*(fin-inicio));
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(int matriz[][]) {
        for(int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int[][] transponerMatriz(int matriz[][], int matrizTemp[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matrizTemp.length; j++) {
                matrizTemp[j][i] = matriz[i][j];
            }
        }
        return matrizTemp;
    }
    public void sumarDiagonal(int matriz[][]){
        if(matriz.length == matriz[0].length){
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if(j == i){
                        suma += matriz[i][j];
                    }
                }
            }
            System.out.println(suma);
        }else{
            System.out.println("Error: La matriz no es cuadrada");
        }
    }
    public int encontrarMaximo(int matriz[][]){
        int maximo = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] >= maximo){
                    maximo = matriz[i][j];
                }
            }
        }
        return maximo;
    }
    public int[][] sumarMatrices(int matrizResultado[][], int matriz[][], int matriz2[][]) {
        for(int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                matrizResultado[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        return matrizResultado;
    }
    public int[][] matrizPorEscalar(int matriz[][], int escalar){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] *= escalar;
            }
        }
        return matriz;
    }
}
