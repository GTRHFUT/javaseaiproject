package com.gtr.arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //目标：认识ArrayList集合的基本功能
        //创建ArrayList对象，代表一个集合容器
        ArrayList<String> list = new ArrayList<>();//用泛型定义集合
        //添加数据
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);
        System.out.println("=========================");
        //查看数据
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("=========================");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
        System.out.println("=========================");
        //删除数据
        System.out.println(list.remove(3));//根据索引删，并返回删除元素的名称
        System.out.println(list);
        System.out.println("=========================");
        System.out.println(list.remove("李四"));//按照元素删除，并返回是否删除成功
        System.out.println(list);
        System.out.println("=========================");
        //修改数据
        list.set(0, "钱七");
        System.out.println(list);
    }
}
