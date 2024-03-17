import java.util.Scanner;

public class AppLetras {
    public static void main(String[] args) {
        Util util = new Util();
        Ordenador ordenador = new Ordenador();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a String que será ordenada: ");
        String frase = sc.nextLine();

        
        char[] array = frase.toCharArray();

        ordenador.quickSort(array, 0, array.length - 1);

        System.out.println("\nString ordenada: ");
        util.imprimirArrayLetras(array);

        sc.close();
    }
}
    
