package com.gtr.demo;

public class Test {
    public static void main(String[] args) {
        //目标：完成面向对象的综合小案例
        //1.设计电影类Movie，以便创建对象，封装电影数据
        //2.封装系统中的全部电影数据（自己早一些数据）

        Movie[] arr = new Movie[6];
        arr[0] = new Movie(1, "大话西游", 9.5, "吴孟达");
        arr[1] = new Movie(2, "西游记", 9.3, "孙悟空");
        arr[2] = new Movie(3, "海贼王", 9.8, "罗大佑");
        arr[3] = new Movie(4,"速度与激情8",9.2,"瑞秋");
        arr[4] = new Movie(5,"夏洛特烦恼",9.2,"沈腾");
        arr[5] = new Movie(6,"战狼",9.1,"吴京");

        //3.创建电影操作对象，专门负责电影数据的业务操作
        MovieOperator mo = new MovieOperator();
        mo.showAllMovies(arr);
        System.out.println("===============================");
        mo.searchMovieById(arr);
    }
}
