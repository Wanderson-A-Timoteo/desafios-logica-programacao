package br.com.wandersontimoteo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array e o valor alvo (separados por espaço):");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println("Digite os elementos do array (separados por espaço):");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifferenceK(arr, k);
        System.out.println("O número de pares que satisfazem o critério é: " + count);
    }

    public static int countPairsWithDifferenceK(int[] arr, int k) {
        int count = 0;

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            int complement = num - k;
            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }
        }

        return count;
    }
}
