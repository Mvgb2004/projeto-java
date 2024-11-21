package src.utils;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número inteiro.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getDouble(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static String getString(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
