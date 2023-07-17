package br.com.wandersontimoteo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas:");
        int numLines = scanner.nextInt();

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        System.out.println("Digite os valores:");
        for (int i = 0; i < numLines; i++) {
            int value = scanner.nextInt();

            if (value % 2 == 0) {
                evenNumbers.add(value);
            } else {
                oddNumbers.add(value);
            }
        }

        Collections.sort(evenNumbers);
        Collections.sort(oddNumbers, Comparator.reverseOrder());

        System.out.println("Saída ordenada:");
        for (int even : evenNumbers) {
            System.out.println(even);
        }

        for (int odd : oddNumbers) {
            System.out.println(odd);
        }
    }
}