package com.gtr.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：面向对象编程实现智能家居系统
        //角色：设备（吊灯、电视机、洗衣机、落地窗...）
        //具备的功能：开和关
        //谁控制他们：智能控制系统（单例对象），控制调用设备的开和关
        //1.定义设备类：创建设备对象代表家里的设备
        //2.准备这些设备对象，存储到一个数组中，代表家里的所有设备
        Appliance[] allAppliance = new Appliance[4];
        allAppliance[0] = new Lamp("欧灯", true);
        allAppliance[1] = new TV("小米电视", false);
        allAppliance[2] = new WashingMachine("美的洗衣机", true);
        allAppliance[3] = new AirCondition("格力空调", false);

        //3.为每个设备制定一个开和关功能，定义一个接口，实现开和关功能
        //4.创建智能控制系统对象，控制设备开和关
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        //5.控制灯
        //smartHomeControl.control(allAppliance[0]);

        //6.提示用户操作，a.展示全部设备的当前情况。   b.让用户选择哪一个操作
        //打印全部折别开和关的目前状态

        while (true) {
            smartHomeControl.printAllisOn(allAppliance);
            System.out.println("请您选择要控制的设备(退出请输入-1)：");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "1":
                    smartHomeControl.control(allAppliance[0]);
                    break;
                case "2":
                    smartHomeControl.control(allAppliance[1]);
                    break;
                case "3":
                    smartHomeControl.control(allAppliance[2]);
                    break;
                case "4":
                    smartHomeControl.control(allAppliance[3]);
                    break;
                case "-1":
                    System.out.println("欢迎下次使用");
                    System.exit(0);
                default:
                    System.out.println("您输入的设备编号有误，请重新输入");
            }
        }
    }
}
