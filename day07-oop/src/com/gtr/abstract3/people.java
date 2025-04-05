package com.gtr.abstract3;

public abstract class people {
    //1.模板方法设计模式：解决方法中存在重复代码的问题
    //如何设计：在抽象类中定义两个方法，一个是模板方法，另一个是抽象方法，在模板方法中被调用，具体实现交给子类
    public final void write(){
        System.out.println("\t\t\t\t\t\t《我的爸爸》");
        System.out.println("\t我的爸爸是一个好人，我特别喜欢他，他对我很好，我来介绍一下:");
        //2.模板方法知道子类一定要写正文，但是每个子类写的信息是不同的,父类定义一个抽象方法
        //具体的实现交给子类来重写正文
        writeMain();
        System.out.println("\t我爸爸真好，你有这样的爸爸吗？");
    }

    public abstract void writeMain();

}
