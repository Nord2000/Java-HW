package HW_1;
import java.util.Scanner;


public class Cybes {
    public static void main(String[] args) {
        // Создаем массив, в котором будут храниться кубы чисел от 1 до 1000
        int[] cubes = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            cubes[i-1] = i*i*i;
        }

        // Запрашиваем у пользователя 2 числа из диапазона 1-1000
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Находим кубы введенных чисел, используя данные из массива
        int cube1 = cubes[num1-1];
        int cube2 = cubes[num2-1];

        // Выводим результаты
        System.out.println("Куб числа " + num1 + " равен " + cube1);
        System.out.println("Куб числа " + num2 + " равен " + cube2);
    }
}
