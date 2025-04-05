package com.gtr;

public class ArrayCase {
    public static void main(String[] args) {
        //目标：完成数字华容道的初始化和随机乱序
        start(5);
    }

    public static void start(int n) {
        //1.定义一个二维数组存储数字列表
        int[][] arr = new int[n][n];

        //2.遍历二维数组，给二维数组赋值
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        printArray(arr);
        System.out.println("===========================");

        //3.打乱二维数组中的元素排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int randomRow = (int) (Math.random() * arr.length);
                int randomCol = (int) (Math.random() * arr[i].length);
                int temp = arr[i][j];
                arr[i][j] = arr[randomRow][randomCol];
                arr[randomRow][randomCol] = temp;
            }
        }
        printArray(arr);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
