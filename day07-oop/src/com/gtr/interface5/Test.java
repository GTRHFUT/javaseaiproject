package com.gtr.interface5;

public class Test {
    public static void main(String[] args) {
        //目标：理解接口的几点注意事项

        //1.接口与接口可以多继承：一个接口可以同时继承多个接口
        //2.一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承，也不支持多实现
        //3.一个类继承了父类，有同时实现了接口，如果父类中有与接口同名的方法，此时父类同名方法会覆盖接口同名方法，实现类会先用父类的
        //4.一个类实现了多个接口，如果多个接口中存在存在同名的默认方法，可以不冲突，这个类重写该方法即可
        Dog d = new Dog();
        d.show();
    }
}


//4.一个类实现了多个接口，如果多个接口中存在存在同名的默认方法，可以不冲突，这个类重写该方法即可
interface A3 {
    default void show() {
        System.out.println("A3 show");
    }
}

interface B3 {
    default void show() {
        System.out.println("B3 show");
    }
}

class C3 implements A3, B3 {
    @Override
    public void show() {
        System.out.println("C3 show");
    }
}


//3.一个类继承了父类，有同时实现了接口，如果父类中有与接口同名的方法，此时父类同名方法会覆盖接口同名方法，实现类会先用父类的
interface A2 {
    default void show() {
        System.out.println("A2 show");
    }
}

class Animal {
    public void show() {
        System.out.println("Animal show");
    }
}

class Dog extends Animal implements A2 {
//    @Override
//    public void show() {
//        System.out.println("Dog show");
//    }
}


//2.一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承，也不支持多实现[了解]
interface A1 {
    void show();
}

interface B1 {
    void show();  //如果同名方法类型返回值一样，则此时支持多继承和多实现，两方法规范合并,否则不支持多继承和多实现
}

interface C1 extends A1, B1 {
}

class D1 implements C1 {
    @Override
    public void show() {
        System.out.println("show");
    }


    //1.接口与接口可以多继承：一个接口可以同时继承多个接口
//类与类：单继承，一个类只能继承一个直接父类
//类与接口：多实现 ，一个类可以同时实现多个接口
//接口与接口：多继承，一个接口可以同时继承多个接口
    interface A {
        void show1();
    }

    interface B {
        void show2();
    }

    interface C extends A, B {
        void show3();
    }

    class D implements C {
        @Override
        public void show1() {
            System.out.println("show1");
        }

        @Override
        public void show2() {
            System.out.println("show2");
        }

        @Override
        public void show3() {
            System.out.println("show3");
        }
    }
}
