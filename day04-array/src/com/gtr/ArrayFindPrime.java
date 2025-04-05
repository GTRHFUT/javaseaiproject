package com.gtr;

public class ArrayFindPrime {
    public static void main(String[] args) {
        findPrime(1000);
    }

    public static void findPrime(int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                arr[i] = false;
            } else {
                arr[i] = true;
            }
        }

        for (int num = 2; num * num <= n; num++) {
            if (arr[num]) {
                for (int mul = num * num; mul <= n; mul += num) {
                    arr[mul] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                System.out.print(i + "\t");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

}
