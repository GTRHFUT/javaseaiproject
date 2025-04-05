package com.gtr.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //目标：搞清楚switch的注意事项，穿透性的应用
        test1();
        //test2();
        test3();
    }

    //1.表达式类型只能是byte、short、char、int,JDK5开始支持enum枚举类型，JDK7开始支持String类型，不支持double、float、long类型
    public static void test1() {
        System.out.println(0.1 + 0.2);//不是0.3
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case2");
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    //2.case给出的值不允许重复，且只能是字面量，不能是变量
//    public static void test2() {
//        int i = 1;
//        switch (i) {
//            case 1:
//                System.out.println("case1");
//                break;
//            case 1:
//                System.out.println("case2");
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }
//    }


    //正常使用switch的时候，不要忘记写break，否则会出现穿透现象
    //周一:埋头苦干,解决bug
    //周二:请求大牛程序员帮忙
    //周三:请求大牛程序员帮忙
    //周四:请求大牛程序员帮忙
    //周五:自己整理代码
    //周六:打游戏
    //周日:打游戏
    public static void test3() {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("埋头苦干,解决bug");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("请求大牛程序员帮忙");
                break;
            case 5:
                System.out.println("自己整理代码");
                break;
            case 6:
            case 7:
                System.out.println("打游戏");
                break;
            default:
                System.out.println("没有这个星期");
        }
    }
}
