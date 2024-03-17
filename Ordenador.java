public class Ordenador {
    public void insertionSort(String[] array) {
        int tamanhoVetor = array.length;

        for (int i = 1; i < tamanhoVetor; i++) {
            String chave = array[i];
            int j = i -1;

            while (j >= 0 && array[j].compareTo(chave) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = chave;
        }
    }

    public void bubbleSort(String[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].length() < array[minIndex].length()) {
                    minIndex = j;
                }
            }
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public void quickSort(char[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(char[] array, int low, int high) {
        char pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        char temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
    
}
