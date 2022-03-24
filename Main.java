import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double one;
        double two;
        char operation;
        double res;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи первое число: ");
        one = scanner.nextDouble();

        System.out.println("Какую операцию произвести? ");
        operation = scanner.next().charAt(0);

        System.out.println("Введи второе число: ");
        two = scanner.nextDouble();

        scanner.close();

        if (operation == '/' && two == 0) {
            System.err.println("На ноль делить нельзя!");
        }

//        switch (operation) {
//            case '+': res = one + two;
//                System.out.println("Результат: " + res);
//                break;
//            case '-': res = one - two;
//                System.out.println("Результат: " + res);
//                break;
//            case '*': res = one * two;
//                System.out.println("Результат: " + res);
//                break;
//            case '/': res = one / two;
//                System.out.println("Результат: " + res);
//                break;
//            default:
//                System.err.println("Введена некорректная операция!");
//                break;
//        }

        // Тест вывода res разными способами
        if (operation == '+') {
            res = one + two;
            System.out.println("Результат: " + res);
        } else if (operation == '-') {
            System.out.println("Результат: " + (one - two));
        } else if (operation == '/') {
            System.out.println("Результат: " + (one / two));
        } else if (operation == '*') {
            System.out.println("Результат: " + (one * two));
        } else {
            System.err.println("Введена некорректная операция!");
        }
    }
}
