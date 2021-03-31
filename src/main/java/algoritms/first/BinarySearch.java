package algoritms.first;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 10, 12, 14, 16, 18, 20, 25, 30, 40, 50};

        System.out.println(binarySearch(a, 18));
        System.out.println(binarySearchR(a, 18, 0, a.length - 1));
    }

    public static int binarySearch (int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            System.out.println("low = " + low);
            System.out.println("high = " + high);

            int middle = low + (high - low) / 2;

            System.out.println("middle = " + middle);

            if (key < a[middle]){
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static int binarySearchR (int[] sortedArray, int key, int low, int high) {
        // считаем индекс центрального элемента
        int middle = low + (high - low) / 2;

        // base case (условие выхода) - регион поиска пустой
        if (low > high) {
            // не нашли элемента, который равен ключу
            return -1;
        }

        if (key == sortedArray[middle]) {
            // в случае, если элемент в центре равняется ключу (нашли элемент)
            return middle;
        } else if (key < sortedArray[middle]) {
            // рекурсивный вызов для левого подмассива
            // не забывайте здесь ключевое слово return (подумайте, зачем оно нужно)
            return binarySearchR(sortedArray, key, low, middle - 1);
        } else {
            // рекурсивный вызов для правого помассива
            return binarySearchR(sortedArray, key, middle + 1, high);
        }
    }
}
