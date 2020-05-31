package com.xTTx;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("一个暴风雨夜中，你意外的来到了游戏世界，你成为了机车族的机战王。");
        System.out.println("而若想回到人类世界，就必须收集猛兽族3员大将的守城令牌，才能回去人类世界，选择你得心应手的机车族战士去战斗吧！！");
        Sense sense=new Sense();
        sense.initSense();
        sense.play();
    }
}
