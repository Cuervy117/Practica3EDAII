import java.util.Random;
class Principal{
    public static void main(String[] args){
        int[] arreglo;
        char[] arr = new char[20];
        char[] ordenado = new char[20];
        arreglo = new int[20];
        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            arreglo[i] = rand.nextInt(100) + 1;
        }
        System.out.println("Arreglo original: ");
        MergeSort.printArray(arreglo);
        MergeSort.mergeSort(arreglo, 0, 19);
        System.out.println("Arreglo Ordenado: ");
        MergeSort.printArray(arreglo);
        arr = CountingSort.leerLista();
        CoutintSort.countingSort(arr);
        MergeSort.printArray(ordenado);
    }
}