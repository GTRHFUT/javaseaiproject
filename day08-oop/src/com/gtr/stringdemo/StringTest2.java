package com.gtr.stringdemo;

public class StringTest2 {
    public static void main(String[] args) {
        //目标：生成验证码
        String code = getCode(6);
        System.out.println(code);

        String code1 = getCode(4);
        System.out.println(code1);
    }

    //帮我生成指定位数的随机验证码返回，每位可能是数字，小写字母，大写字母
    //帮我用String变量记住全部要用的字符
    public static String getCode(int n) {
        //1.定义一个变量，用来保存全部的字符
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //2.定义一个变量用于记住验证码的随机字符
        String code = "";
        for (int i = 0; i < n; i++) {
            //3.生成一个随机数，用随机数下标获取一个字符
            int index = (int) (Math.random() * str.length());
            code += str.charAt(index);
        }
        return code;
    }

}
