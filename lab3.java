public class lab3 {

    public static void main(String[] args) {

        // Задача 1
        double x1 = 0.5;
        double sum1 = 0;
        for (int n = 1; n <= 10; n++) {
            double chislitel = Math.pow(-1, n) * (2 * n) * Math.pow(x1, 2 * n + 1);
            double znamenatel = fact(2 * n + 1);
            sum1 += chislitel / znamenatel;
        }
        System.out.println("Задача 1: " + sum1);

        // Задача 2
        double x2 = 1;
        double sum2 = 0;
        for (int n = 0; n < 10; n++) {
            sum2 += Math.pow(x2, 2 * n + 1) / (2 * n + 1);
        }
        System.out.println("Задача 2: " + sum2);

        // Задача 3
        double x3 = 2;
        double sum3 = 0;
        for (int n = 0; n < 10; n++) {
            sum3 += Math.pow(x3, 4 * n + 1) / (4 * n + 1);
        }
        System.out.println("Задача 3: " + sum3);

        // Задача 14
        double x14 = 3.4;
        double sum14 = 0;
        for (int n = 0; n < 10; n++) {
            double slagaemoe = Math.pow(-1, n) * Math.pow(x14, 2 * n + 1) * (1 + x14 * x14) / (2 * n + 1);
            sum14 += slagaemoe;
        }
        System.out.println("Задача 14: " + sum14);

        // Задача 15
        double x15 = 1.2;
        double sum15 = 0;
        for (int n = 1; n <= 10; n++) {
            double slagaemoe = Math.pow(-1, n - 1) * Math.pow(x15, n) * (1 + x15) / n;
            sum15 += slagaemoe;
        }
        System.out.println("Задача 15: " + sum15);

        // Задача 16
        double x16 = 2.2;
        double sum16 = x16;
        for (int n = 1; n <= 10; n++) {
            double slagaemoe = Math.pow(-1, n + 1) * Math.pow(x16, 2 * n + 1) / (4 * n * n - 1);
            sum16 += 2 * slagaemoe;
        }
        System.out.println("Задача 16: " + sum16);
    }


    public static long fact(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}