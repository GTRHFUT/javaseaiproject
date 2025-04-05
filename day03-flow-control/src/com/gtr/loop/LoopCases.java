package com.gtr.loop;

import java.util.Random;
import java.util.Scanner;

public class LoopCases {
    public static void main(String[] args) {
//        简单计算器
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入第一个数字: ");
//        double a = sc.nextDouble();
//        System.out.print("请输入第二个数字: ");
//        double b = sc.nextDouble();
//        System.out.print("请输入您要进行的运算类型(+ - * /): ");
//        char operator = sc.next().charAt(0);
//        calculator(a, b, operator);
//
//        猜数字游戏：随机生成一个1~100之间的整数，提示用户输入，猜大提示过大，猜小提示过小，猜对提示恭喜你猜对了
//        guessNumber();

//        随机生成一个n位的验证码,每位只能是数字、小写或大写字母
//        System.out.println("验证码：" + getCode(4));
//        System.out.println("验证码：" + getCode(6));


//      找素数
        findPrime(101, 200);
    }


    //简单计算器
    public static void calculator(double a, double b, char op) {
        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }

    //猜数字游戏：随机生成一个1~100之间的整数，提示用户输入，猜大提示过大，猜小提示过小，猜对提示恭喜你猜对了
    public static void guessNumber() {
        //1.方式一：
        //Math.random()返回[0,1)之间的随机小数
        //(int)(Math.random() * 100) 返回[0,99]之间的随机整数
        //int number = (int) (Math.random() * 100 ) + 1;

        //2.方式二：
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入一个1~100之间的整数: ");
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            if (guess > number) {
                System.out.println("猜大了");
            } else if (guess < number) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }


    //随机生成一个n位的验证码,每位只能是数字、小写或大写字母
    public static String getCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = (int) (Math.random() * 3);
            switch (type) {
                case 0:
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                case 1:
                    int lower = (int) (Math.random() * 26);
                    char ch1 = (char) ('a' + lower);
                    code += ch1;
                    break;
                default:
                    int upper = (int) (Math.random() * 26);
                    char ch2 = (char) ('A' + upper);
                    code += ch2;
            }
        }
        return code;
    }

    //找素数
    //1.判断一个数是否是素数
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    //2.给出寻找的起始和结束范围
    public static void findPrime(int start, int end) {
        int PrimeCount = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
                PrimeCount++;
            }
        }
        System.out.println("\n" + start + "~" + end + "之间的素数个数：" + PrimeCount);
    }

}
