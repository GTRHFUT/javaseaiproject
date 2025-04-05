package com.gtr.demo;

//智能控制系统（单例类）
public class SmartHomeControl {

    private SmartHomeControl() {
    }

    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();

    public static SmartHomeControl getInstance() {
        return smartHomeControl;
    }

    public void control(Appliance appliance) {
        //System.out.println(appliance.getName() + "状态目前是: " + (appliance.isOn() ? "开" : "关"));
        System.out.println("请开始您的操作=======");
        appliance.press();
        //System.out.println(appliance.getName() + "状态已经是: " + (appliance.isOn() ? "开" : "关"));
    }

    public void printAllisOn(Appliance[] allAppliance) {
        for (int i = 0; i < allAppliance.length; i++) {
            Appliance appliance = allAppliance[i];
            System.out.println((i + 1) + "、" + appliance.getName() + "状态目前是: " + (appliance.isOn() ? "开" : "关"));
        }
    }
}
