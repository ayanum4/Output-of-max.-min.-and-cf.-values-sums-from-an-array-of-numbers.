import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
while (true) {
    try {
        System.out.println("Введите числа через пробел: ");
        String input = scanner.nextLine();
        String[] parts = input.trim().split("\\s+");

        int[] numbers = new int[parts.length];
        int amount = 0;
        
        for (int i = 0; i < parts.length; i++) {
            int number = Integer.parseInt(parts[i]);
            numbers[i] = number;
            amount += number;
        }

        int maxValue = numbers[0];
        int minValue = numbers[0];

        for (int num : numbers) {
            if (num > maxValue) {
                maxValue = num;
            }
            if (num < minValue) {
                minValue = num;
            }
        }

        double average = (double) amount / numbers.length;

        System.out.println("Вы ввели:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nСумма: " + amount);
        System.out.printf("Среднее значение: %.2f", average);
        System.out.println("\nМин. значение: " + minValue);
        System.out.println("Макс. значение: " + maxValue);
    } catch (Exception e) {
        System.out.println("Ошибка ввода: " + e.getMessage());
    }
    }}}