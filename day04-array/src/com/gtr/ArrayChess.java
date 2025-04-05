package com.gtr;

public class ArrayChess {
    public static void main(String[] args) {
        //目标：完成斗地主游戏的做牌和洗牌
        start();
    }

    public static void start() {
        //1.制作扑克牌，创建一个动态初始化的数组存储54张牌
        String[] porkers = new String[54];

        //2.准备四种花色，还有点数，再开始做牌存入数组中去
        String[] colors = {"红桃", "黑桃", "方块", "梅花"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //3.遍历点数，再遍历花色
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                porkers[index++] = colors[j] + numbers[i];

            }
        }

        //4.将大小王存入数组中去
        porkers[index++] = "小王";
        porkers[index] = "大王";

        //5.打印制作扑克牌
        for (int i = 0; i < porkers.length; i++) {
            System.out.print(porkers[i] + " ");
        }
        System.out.println();

        //6.洗牌，随机打乱数组
        for (int i = 0; i < porkers.length; i++) {
            int index1 = (int)(Math.random()*porkers.length);
            int index2 = (int)(Math.random()*porkers.length);
            String temp = porkers[index1];
            porkers[index1] = porkers[index2];
            porkers[index2] = temp;
        }

        //7.打印洗牌后的扑克牌
        for(String porker:porkers){
            System.out.print(porker + " ");
        }
        System.out.println();
    }
}
