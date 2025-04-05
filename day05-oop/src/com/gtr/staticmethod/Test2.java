package com.gtr.staticmethod;

public class Test2 {
    public static void main(String[] args) {
        //目标：搞清楚静态方法的应用，可以做工具类
        //登录界面
        //开发一个验证码程序
        String code = VerifyCodeUtil.generateVerifyCode(4);
        System.out.println(code);
    }
}
