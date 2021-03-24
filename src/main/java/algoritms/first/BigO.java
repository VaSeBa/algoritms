package algoritms.first;

/**
 * Big O нотация нужна для описания сложности алгоритмов
 * */
public class BigO {
    public static void main(String[] args) {

    }


    // наивный - медленный метод
    // рекурсивный метод
    // O(2^n) - самый медленный
    public static long fibNaive(int n) {
        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    // эффективный метод
    // O(n) - оценка
    public static long fibEffective (int n) {
        // O(n)
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;
        // n = 2 => 1
        // n = 3 => 2
        // n = 4 => 3 т.е. растет линейно


        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr [i - 2];
        }

        return arr[n];
    }
}

// 1.000.000x
// x

// 1000y
// (1/1.000.000)*2^1000