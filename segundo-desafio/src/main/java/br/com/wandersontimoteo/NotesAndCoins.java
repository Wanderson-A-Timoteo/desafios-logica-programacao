package br.com.wandersontimoteo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        scanner.useDelimiter("\\n");

        System.out.println("Digite o valor monetário:");
        double value = Double.parseDouble(scanner.next().replace(',', '.'));

        System.out.println("NOTAS:");
        System.out.println((int) value / 100 + " notas de R$ 100.00");
        value %= 100;

        System.out.println((int) value / 50 + " notas de R$ 50.00");
        value %= 50;

        System.out.println((int) value / 20 + " notas de R$ 20.00");
        value %= 20;

        System.out.println((int) value / 10 + " notas de R$ 10.00");
        value %= 10;

        System.out.println((int) value / 5 + " notas de R$ 5.00");
        value %= 5;

        System.out.println((int) value / 2 + " notas de R$ 2.00");
        value %= 2;

        System.out.println("MOEDAS:");
        System.out.println((int) value / 1 + " moedas de R$ 1.00");
        value %= 1;

        System.out.println((int) (value / 0.50) + " moedas de R$ 0.50");
        value %= 0.50;

        System.out.println((int) (value / 0.25) + " moedas de R$ 0.25");
        value %= 0.25;

        System.out.println((int) (value / 0.10) + " moedas de R$ 0.10");
        value %= 0.10;

        System.out.println((int) (value / 0.05) + " moedas de R$ 0.05");
        value %= 0.05;

        System.out.println((int) (value / 0.01) + " moedas de R$ 0.01");
    }
}
