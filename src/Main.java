//Задание №1
public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");

//Задание №2
        int maxSumm = 99000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSumm) {
                maxSumm = arr[i];
            }
        }
        System.out.println("Макснимальная сумма трат за день составила " + maxSumm + " рублей");
        int minSumm = 201000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSumm) {
                minSumm = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumm + " рублей");


//Задание №3
        float AverageSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            AverageSumm += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + AverageSumm / 30 + " рублей");

//Задание №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[10-i]);
        }
    }


// Генератор случайных чисел
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            // System.out.println(arr[i]);
        }

        return arr;

    }
}
