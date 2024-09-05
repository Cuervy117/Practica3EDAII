import java.util.Arrays;
import java.util.Scanner;
public class CountingSort{
    public static void leerLista(String arreglo[], Scanner sc){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = sc.nextLine();
        }   
    }

    public static void conteo(String[] arr, int[] letras){
        for(int i = 0; i < arr.length; i++){
            switch(arr[i]){
                case "A" -> letras[0] += 1;
                case "B" -> letras[1] += 1;
                case "C" -> letras[2] += 1;
                case "D" -> letras[3] += 1;
                case "E" -> letras[4] += 1;
                case "F" -> letras[5] += 1;
                case "G" -> letras[6] += 1;
                case "H" -> letras[7] += 1;
                case "I" -> letras[8] += 1;
                case "J" -> letras[9] += 1;   
            }
        }
    }

    public static void sumaConteo(int[] letras){
        for(int i = 1; i < letras.length; i++){
            letras[i] += letras[i - 1];
        }
    }

    public static void acomodo(int[] letras, String[] ordenado, String[] arr){
        Arrays.fill(ordenado, "0");
        for(int i = arr.length-1; i >= 0; i--){
            switch(arr[i]){
                case "A" -> {
                    ordenado[letras[0] - 1 ] = arr[i];
                    letras[0] -= 1;
                }
                case "B" -> {
                    ordenado[letras[1] - 1 ] = arr[i];
                    letras[1] -= 1;
                }
                case "C" -> {
                    ordenado[letras[2] - 1 ] = arr[i];
                    letras[2] -= 1;
                }
                case "D" -> {
                    ordenado[letras[3] - 1 ] = arr[i];
                    letras[3] -= 1;
                }
                case "E" -> {
                    ordenado[letras[4] - 1 ] = arr[i];
                    letras[4] -= 1;
                }
                case "F" -> {
                    ordenado[letras[5] - 1 ] = arr[i];
                    letras[5] -= 1;
                }
                case "G" -> {
                    ordenado[letras[6] - 1 ] = arr[i];
                    letras[6] -= 1;
                }
                case "H" -> {
                    ordenado[letras[7] - 1 ] = arr[i];
                    letras[7] -= 1;
                }
                case "I" -> {
                    ordenado[letras[8] - 1 ] = arr[i];
                    letras[8] -= 1;
                }
                case "J" -> {
                    ordenado[letras[9] - 1 ] = arr[i];
                    letras[9] -= 1;
                } 
            }
            System.out.println("Iteracion " + (arr.length - i));
            System.out.println("Arreglo de conteo: " + Arrays.toString(letras));
            System.out.println("Arreglo ordenado: " + Arrays.toString(ordenado));
        }
    }
    
    public static String[] countingSort(String arr[]){
        int[] letras = new int[10];
        String[] ordenado = new String[20];

        CountingSort.conteo(arr, letras);
        System.out.println("Arreglo de conteo: " + Arrays.toString(letras));

        CountingSort.sumaConteo(letras);
        System.out.println("Suma del arreglo de conteo: " + Arrays.toString(letras));

        CountingSort.acomodo(letras, ordenado, arr);
        
        return ordenado;
    }
}