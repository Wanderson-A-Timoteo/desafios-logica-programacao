package br.com.wandersontimoteo;

import java.util.Scanner;

public class PrinterVirus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de casos de teste:");
        int numTestCases = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite as frases a serem decifradas:");

        for (int i = 0; i < numTestCases; i++) {
            String line = scanner.nextLine();
            String originalLine = decodeLine(line);
            System.out.println(originalLine);
        }
    }

    public static String decodeLine(String line) {
        int length = line.length();
        int halfLength = length / 2;
        StringBuilder originalLine = new StringBuilder();

        for (int i = halfLength - 1; i >= 0; i--) {
            originalLine.append(line.charAt(i));
        }

        for (int i = length - 1; i >= halfLength; i--) {
            originalLine.append(line.charAt(i));
        }

        return originalLine.toString();
    }
}