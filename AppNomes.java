import java.util.Scanner;

public class AppNomes {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();
        Util util = new Util();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos nomes você deseja digitar? ");
        int nomes = sc.nextInt();
        sc.nextLine();

        String[] array = new String[nomes];

        System.out.println("Informe os nomes: ");
        
         for (int i = 0; i < nomes; i++) {
            array[i] = sc.nextLine();
            
        }

        ordenador.insertionSort(array);

        System.out.println("\nNomes ordenados: "); 
        util.imprimirArrayNomes(array);
        
        sc.close();
    }
    
}
