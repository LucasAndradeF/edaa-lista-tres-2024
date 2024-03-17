public class Util {
    public void imprimirArrayNomes(String[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    public void imprimirArrayString(String[] array) {
        for (String s : array) {
            System.out.print(s);
        }
        System.out.println();
    }

    public void imprimirArrayNomesOrdenados(String[] array) {    
        for (String nome : array) {
            System.out.println(nome);
        }
    }

    public void imprimirArrayLetras(char[] array) {
        for (char c : array) {
            System.out.print(c);
        }
        System.out.println();
    }
}
    

