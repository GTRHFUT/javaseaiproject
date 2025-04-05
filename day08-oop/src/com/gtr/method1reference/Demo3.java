package com.gtr.method1reference;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        //目标：特定类型的方法引用
        //需求：有一个字符串数组，里面有一些名字，请按照名字的首字母升序排序
        String[] names = {"Tom", "Jerry", "曹操", "Mike", "angela", "Dlei", "Jack", "Rose", "caocao", "Andy", "Bob"};

        //把数组进行排序：Arrays.sort(names,Comparator)
        //Arrays.sort(names);//默认按照首字母的编号升序排列
        //要求：忽略首字母的的大小进行排序
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //o1
//                //o2
//                return o1.compareToIgnoreCase(o2);//Java提供的按照字符串首字母忽略大小，进行比较的方法
//            }
//        });

        //特定类型方法引用：
        //格式：类型名::方法名
        //使用前提：如果某个Lambda表达式里只是调用一个特定类型的实例方法，并且前面参数列表中的第一个参数式作为
        //方法的主调，后面的所有参数都是作为该实例方法的入参的，则此时就可以使用特定类型的方法引用。

//       Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        Arrays.sort(names, String::compareToIgnoreCase);


        System.out.println(Arrays.toString(names));
    }
}
