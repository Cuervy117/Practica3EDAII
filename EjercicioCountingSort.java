import java.util.Arrays;
//import java.util.Random;
import java.util.Scanner;
class EjercicioCountingSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[20];
        String[] ordenado = new String[20];

        CountingSort.leerLista(arr, sc);
        ordenado = CountingSort.countingSort(arr);
        System.out.println("Arreglo finalmente ordenado: " + Arrays.toString(ordenado));
    }
}