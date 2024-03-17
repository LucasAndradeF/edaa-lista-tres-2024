import java.util.Scanner;

public class AppString {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();
        Util util = new Util();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a String que será ordenada:");
        String frase = sc.nextLine();

        String[] array = frase.split("");

        ordenador.bubbleSort(array);

        System.out.println("\nString ordenada:");
        util.imprimirArrayString(array);

        sc.close();
    }
}