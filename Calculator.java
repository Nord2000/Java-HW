package HW_1;
import java.util.Scanner;

public class Calculator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем первое число
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        // Запрашиваем оператор
        System.out.print("Введите оператор (+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        // Запрашиваем второе число
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int result;

        // Выполняем выбранную операцию
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверный оператор");
                return;
        }

        // Выводим результат
        System.out.println("Результат: " + result);
    }

}
