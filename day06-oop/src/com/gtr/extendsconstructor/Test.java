package com.gtr.extendsconstructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识子类构造器，再看应用场景
        //子类构造器必须先调用父类构造器，再执行自己的代码
        Zi z = new Zi();
    }
}


class Fu {
    public Fu() {
        System.out.println("父类无参构造器");
    }

    public Fu(int a) {
        System.out.println("父类有参构造器" + a);
    }
}

class Zi extends Fu {
    public Zi() {
        super();//默认存在的，写不写都有，会调用父类的无参构造器
        //如果父类没有无参构造器，我们必须在子类构造器第一行写super();来指定调用父类的有参构造器
        //super(666);//指定调用父类的有参构造器
        System.out.println("子类无参构造器");
    }
}

