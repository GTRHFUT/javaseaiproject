package com.gtr.branch;

public class IfDemo2 {
    public static void main(String[] args) {
        //目标：完成汽车自动驾驶程序的书写，以便可以根据红绿灯状态正确行驶
        test1();
    }

    public static void test1() {
        //1.假设现在通过摄像头获取到了三种灯的状态信息
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        //2.根据获取到的灯的状态信息，判断是否需要停止，是否需要准备，是否需要开始
        if (red) {
            System.out.println("红灯亮，停止！");
        } else if (yellow) {
            System.out.println("黄灯亮，准备！");
        } else if (green) {
            System.out.println("绿灯亮，开始");
        } else {
            System.out.println("灯故障，停止");
        }
    }
}
