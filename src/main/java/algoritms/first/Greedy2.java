package algoritms.first;

/**
 * Жадный алгоритм — алгоритм, заключающийся в принятии локально
 * оптимальных решений на каждом этапе, допуская,
 * что конечное решение также окажется оптимальным

 * TODO Задача 2 - вы едете на автомобиле, авто может проехать на одной заправке 400 км.
 * расстояние 950 км. нужно проехать все расстояние с минимальным количеством заправок
 */

public class Greedy2 {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stations, 400));
    }

    // если доехать не возможно то -1
    public static int minStops(int [] stations, int capacity) {
        int result = 0; // оптимальное количество остановок
        int currentStop = 0;

        while (currentStop < stations.length -1) {
            int nextStop = currentStop;

            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;

                if (currentStop == nextStop)
                    return -1;

                if (nextStop < stations.length - 1)
                    result++;

                currentStop = nextStop;
        }

        return result;
    }

}
