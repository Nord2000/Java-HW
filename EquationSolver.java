package HW_1;

public class EquationSolver {
    public static void main(String[] args) {
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    String equation = q + "" + w + " + " + e + " = " + (q + w + e);
                    if (isValidEquation(equation)) {
                        System.out.println("Решение: " + equation);
                        return;
                    }
                }
            }
        }
        System.out.println("Решение не найдено.");
    }

    private static boolean isValidEquation(String equation) {
        // Разбиваем выражение на части
        String[] parts = equation.split(" ");
        int q = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[2]);
        int e = Integer.parseInt(parts[4]);

        // Проверяем, является ли выражение верным
        return (q + w) == e;
    }
}
