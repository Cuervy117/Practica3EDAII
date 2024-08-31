import java.util.Scanner;
class CoutintSort{
    static char[] leerLista(){
        Scanner sc = new Scanner(System.in)
        char[] arreglo = new char[20]
        for(int i = 0; i < 20; i++){
            arreglo[i] = sc.next();
        }   
        return arreglo;
    }

    static char[] countingSort(char arr[]){
        int[] Letras = new int[10];
        Letras = 0;
        char[] ordenado = new char[20];
        for(int i = 0; i < arr.length; i++){
            switch(arr[i]){
                case "A" -> Letras[0] += 1;
                case "B" -> Letras[1] += 1;
                case "C" -> Letras[2] += 1;
                case "D" -> Letras[3] += 1;
                case "E" -> Letras[4] += 1;
                case "F" -> Letras[5] += 1;
                case "G" -> Letras[6] += 1;
                case "H" -> Letras[7] += 1;
                case "I" -> Letras[8] += 1;
                case "J" -> Letras[9] += 1;   
            }
        }
        MergeSort.printArray(Letras);
        for(int i = 1; i < Letras.length; i++){
            Letras[i] += Letras[i - 1];
        }
        MergeSort.printArray(Letras);
        for(int i = arr.length-1; i >= 0; i--){
            switch(arr[i]){
                case "A" -> {
                    ordenado[Letras[0] - 1 ] = arr[i];
                    Letras[0] -= 1;
                };
                case "B" -> {
                    ordenado[Letras[1] - 1 ] = arr[i];
                    Letras[1] -= 1;
                };
                case "C" -> {
                    ordenado[Letras[2] - 1 ] = arr[i];
                    Letras[2] -= 1;
                };
                case "D" -> {
                    ordenado[Letras[3] - 1 ] = arr[i];
                    Letras[3] -= 1;
                };
                case "E" -> {
                    ordenado[Letras[4] - 1 ] = arr[i];
                    Letras[4] -= 1;
                };
                case "F" -> {
                    ordenado[Letras[5] - 1 ] = arr[i];
                    Letras[5] -= 1;
                };
                case "G" -> {
                    ordenado[Letras[6] - 1 ] = arr[i];
                    Letras[6] -= 1;
                };
                case "H" -> {
                    ordenado[Letras[7] - 1 ] = arr[i];
                    Letras[7] -= 1;
                };
                case "I" -> {
                    ordenado[Letras[8] - 1 ] = arr[i];
                    Letras[8] -= 1;
                };
                case "J" -> {
                    ordenado[Letras[9] - 1 ] = arr[i];
                    Letras[9] -= 1;
                }; 
            }
        }
        return ordenado;
    }
}