package com.gtr;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //目标：掌握二维数组的定义和使用
        printArray();
    }

    public static void printArray() {
        //静态初始化二维数组
        String[][] classroom = {
                {"张无忌", "赵敏", "周芷若"},//(0,0)  (0,1)  (0,2)
                {"张三丰", "宋远桥", "殷梨亭"},//(1,0)  (1,1)  (1,2)
                {"灭绝", "成昆", "玄冥二老", "金毛狮王"},//(2,0)  (2,1)  (2,2)  (2,3)
                {"杨耀", "纪晓芙"}//(3,0)  (3,1)
        };

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("==================================");

        //随机打乱座位顺序
        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                int randomRow = (int) (Math.random() * classroom.length);
                int randomCol = (int) (Math.random() * classroom[randomRow].length);
                String temp = classroom[i][j];
                classroom[i][j] = classroom[randomRow][randomCol];
                classroom[randomRow][randomCol] = temp;
            }
        }

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + "\t\t");
            }
            System.out.println();
        }


        //动态初始化二维数组
        int[][] arr = new int[3][5];
    }
}
