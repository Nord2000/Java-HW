package HW_1;
import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        // Запрашиваем у пользователя количество чисел
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        // Создаем массив для хранения чисел и заполняем его
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            numbers[i] = scanner.nextInt();
        }

        // Запрашиваем у пользователя множитель
        System.out.print("Введите множитель: ");
        int multiplier = scanner.nextInt();

        // Умножаем числа на множитель и выводим результат построчно
        for (int i = 0; i < n; i++) {
            int result = numbers[i] * multiplier;
            System.out.println(result);
        }
    }
}
