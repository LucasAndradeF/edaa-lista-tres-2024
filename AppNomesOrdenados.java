import java.util.Scanner;

public class AppNomesOrdenados {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();
        Scanner sc = new Scanner(System.in);
        Util util = new Util();

        System.out.println("Quantos nomes você deseja digitar?");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] nomes = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "° " + "nome:");
            nomes[i] = sc.nextLine();
        }

        ordenador.selectionSort(nomes);

        System.out.println("\nNomes ordenados pelo tamanho:");
        util.imprimirArrayNomesOrdenados(nomes);
        
        sc.close();
    }
    
}
