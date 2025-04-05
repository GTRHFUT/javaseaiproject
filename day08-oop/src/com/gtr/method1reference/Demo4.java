package com.gtr.method1reference;

public class Demo4 {
    public static void main(String[] args) {
        //目标：理解构造器引用
        //创建了接口的匿名内部类对象
//        CarFactory cf = new CarFactory() {
//            @Override
//            public Car getCar(String name) {
//                return new Car(name);
//            }
//        };

        //简化
        //构造器引用
        //格式：类名::new
        //前提：如果某个Lambda表达式里只是在创建对象，并且"->"前后参数情况一致，就可以使用构造器引用
        CarFactory cf = Car::new;


        Car c1 = cf.getCar("保时捷");
        System.out.println(c1.getName());

    }
}

@FunctionalInterface
interface CarFactory {
    Car getCar(String name);
}

class Car {
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}