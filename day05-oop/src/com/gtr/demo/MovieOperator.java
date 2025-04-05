package com.gtr.demo;

import java.util.Scanner;

//电影操作类
public class MovieOperator {

    public void showAllMovies(Movie[] arr) {
        System.out.println("所有电影为: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId() + "、" + arr[i].getName() + " " + arr[i].getScore() + " " + arr[i].getActor());
        }
    }

    public void searchMovieById(Movie[] arr) {
        System.out.println("请输入您要查找的电影编号: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId() == id){
                System.out.println(arr[i].getId() + "、" + arr[i].getName() + " " + arr[i].getScore() + " " + arr[i].getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}
