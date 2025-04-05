package com.gtr;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //静态数组
        String[] names={"张三","李四","王五","刘六","kk"};
        System.out.println(randomSelect(names));
    }

    public static String randomSelect(String[] names){
        int num = (int)(Math.random()*names.length);
        return names[num];
    }
}
