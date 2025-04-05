package com.gtr.demo;

//家电
public class Appliance implements Switch {
    private String name;
    private boolean isOn;//boolean类型变量默认为false

    public Appliance() {
    }

    public Appliance(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void press() {
        //控制家电的开和关
        isOn = !isOn;
    }
}
