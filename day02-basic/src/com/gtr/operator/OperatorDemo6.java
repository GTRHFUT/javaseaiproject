package com.gtr.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //目标：掌握逻辑运算符的使用
//        System.out.println("下面是择偶环节");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入身高：");
//        int height = sc.nextInt();
//        System.out.println("请输入体重：");
//        int weight = sc.nextInt();
//        System.out.println("请输入性别：");
//        char sex = sc.next().charAt(0);
//        System.out.println(isMatch(height, weight, sex));


//        System.out.println("\n\n下面是找男朋友环节");
//        System.out.println("请输入身高：");
//        int HisHeight = sc.nextInt();
//        System.out.println("请输入收入：");
//        int HisIncome = sc.nextInt();
//        System.out.println(findBoyFriend(HisHeight, HisIncome));
//

        isMatch3(true);
        System.out.println("======================");
        isMatch4();
        System.out.println("======================");
        print();
    }

    //需求：判断某个人的条件是否满足择偶要求，如果满足返回true，否则返回false
    //条件是：身高大于170，体重大于60，且性别为女
    public static String isMatch(int height, int weight, char sex) {
        boolean flag = height > 170 & weight > 60 & sex == '女';//&是逻辑与运算符，如果两个条件都满足，返回true，否则返回false
        return flag == true ? "符合择偶要求" : "不符合择偶要求";
    }

    //需求：找一个男朋友，要么身高不低于180，要么收入不低于30万
    public static String findBoyFriend(int height, int income) {
        boolean flag = height >= 180 | income >= 300000;//|是逻辑或运算符，如果两个条件有一个满足，返回true，否则返回false
        return flag == true ? "找到了男朋友" : "没找到男朋友";
    }

    //！非，你真我假，我假你真
    public static void isMatch3(boolean flag) {
        System.out.println(!flag);
    }

    //^异或运算符，两个值不同为真，否则为假
    public static void isMatch4() {
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
    }

    //判断&&  ||与&  |的区别
    public static void print() {
        int a = 111;
        int b = 2;
        System.out.println(a > 1000 && ++b > 1);//没执行了++b
        System.out.println(b);
        System.out.println(a > 1000 & ++b > 1);//执行了++b
        System.out.println(b);

        int i = 10;
        int j = 20;
        System.out.println(i > 6 || ++j > 1);//没执行了++j
        System.out.println(j);
        System.out.println(i > 6 | ++j > 1);//执行了++j
        System.out.println(j);
    }
}
