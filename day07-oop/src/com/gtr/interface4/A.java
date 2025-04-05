package com.gtr.interface4;

public interface A {
    //1.默认方法（普通实例方法）:必须加default修饰
    //默认会用public修饰
    //如何调用?  使用接口的实现类对象来调用
    default void go() {
        System.out.println("===go方法执行了===");
        run();
    }

    //2.私有方法：必须加private修饰
    //私有的实例方法，不能直接调用，只能使用接口中的其他实例方法来调用
    private void run() {
        System.out.println("===run方法执行了===");
    }

    //3.静态方法：必须加static修饰
    //默认会用public修饰
    //如何调用?  只能使用当前接口名来调用
    static void show() {
        System.out.println("===show方法执行了===");
    }
}
