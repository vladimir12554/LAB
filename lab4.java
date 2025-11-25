public class lab4 {
    // Метод для поиска индексов минимального и максимального элементов массива
    public static class MinMaxIndices {
        int minIndex;
        int maxIndex;

        MinMaxIndices(int minIndex, int maxIndex) {
            this.minIndex = minIndex;
            this.maxIndex = maxIndex;
        }
    }

    public static MinMaxIndices findMinMaxIndices(double[] array) {
        if (array == null || array.length == 0) {
            return new MinMaxIndices(-1, -1);
        }

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        return new MinMaxIndices(minIndex, maxIndex);
    }

    public static void main(String[] args) {
        // Пример массивов A, B, C с размерами NA, NB, NC
        double[] A = {3.5, 1.2, 4.7, 0.8, 2.9};
        double[] B = {7.1, 2.3, 5.6, 9.4};
        double[] C = {1.1, 8.2, 3.3};

        // Поиск мин и макс индексов для массива A
        MinMaxIndices indicesA = findMinMaxIndices(A);
        System.out.println("Массив А:");
        System.out.print("Элементы: ");
        for (double v : A) System.out.print(v + " ");
        System.out.println("\nРазмер (NA): " + A.length);
        System.out.println("Индекс минимального: " + indicesA.minIndex + ", Значение: " + A[indicesA.minIndex]);
        System.out.println("Индекс максимального: " + indicesA.maxIndex + ", Значение: " + A[indicesA.maxIndex]);
        System.out.println();

        // Поиск мин и макс индексов для массива B
        MinMaxIndices indicesB = findMinMaxIndices(B);
        System.out.println("Массив Б:");
        System.out.print("Элементы: ");
        for (double v : B) System.out.print(v + " ");
        System.out.println("\nРазмер (NB): " + B.length);
        System.out.println("Индекс минимального: " + indicesB.minIndex + ", Значение: " + B[indicesB.minIndex]);
        System.out.println("Индекс максимального: " + indicesB.maxIndex + ", Значение: " + B[indicesB.maxIndex]);
        System.out.println();

        // Поиск мин и макс индексов для массива C
        MinMaxIndices indicesC = findMinMaxIndices(C);
        System.out.println("Массив В:");
        System.out.print("Элементы: ");
        for (double v : C) System.out.print(v + " ");
        System.out.println("\nРазмер (NC): " + C.length);
        System.out.println("Индекс минимального: " + indicesC.minIndex + ", Значение: " + C[indicesC.minIndex]);
        System.out.println("Индекс максимального: " + indicesC.maxIndex + ", Значение: " + C[indicesC.maxIndex]);
    }
}