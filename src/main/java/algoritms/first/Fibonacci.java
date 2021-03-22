package algoritms.first;

/**
 *
 * Числа Фибоначи
 * 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34 - 55 - 89....
 * (сумма 2х предыдущих чисел)
 *
 */

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibNaive(0));
//        System.out.println(fibNaive(1));
//        System.out.println(fibNaive(3));
//        System.out.println(fibNaive(5));
//        System.out.println(fibNaive(10));
//        System.out.println(fibNaive(100)); // вычисление 50 000 лет

        System.out.println(fibEffective(10));
        System.out.println(fibEffective(100));
    }

    // наивный - медленный метод
    // рекурсивный метод
    public static long fibNaive(int n) {
        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    // эффективный метод
    public static long fibEffective (int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr [i - 2];
        }

        return arr[n];
    }
}
