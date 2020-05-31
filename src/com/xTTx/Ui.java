package com.xTTx;

public class Ui {
    public void display1(Sense sense) {
        System.out.println("------------------------------------------");
        System.out.println("霹雳火，HP：300，雷霆半月斩造成伤害：80");
        System.out.println("超音速，HP：200，破空寒冰砍造成伤害：120");
        System.out.println("力霸天，HP：500，泰山陨石坠造成伤害：50");
        System.out.println("------------------------------------------");
    }

    public void displayStaus(Sense sense, map map) {
        System.out.println(sense.getHero().getDescription() + ":" + sense.getHero().getHP());
        if (map.currentRoom.description.equals("火龙山谷")) {
            if (sense.getHero().getHP() < 300) {
                System.out.println("机战王，我已经在此地恭候你多时恭喜你多时了，是不是面对强大的猛兽族有些困难。");
                System.out.println("快输入（mega） 完成超进化吧");
            }
        } else {
            for (Monster item : sense.getMonsterset().getMonsters()) {
                if (item.getRoom().equals(map.currentRoom.description))
                    System.out.println("这里的守城大将是" + item.getDescription() + "(" + item.getId() + ")" + "  HP:" + item.getHP());
            }
            System.out.println();
            System.out.println("------------------------------------------");
        }
    }

    public void showbattle(Sense sense, map map) {
        if (sense.getHero().getHP() <= 0) {
            System.out.println("你已阵亡，Game over");
            System.out.println("是不是觉得很奇怪，好像根本打不完猛兽族就会阵亡啊，可能你忽略了什么小细节，快去再来一次吧        （仔细逛逛地图，彩蛋待你开启）");
            System.exit(0);
        }
        for (Monster item : sense.getMonsterset().getMonsters()) {
            if (item.getRoom().equals(map.currentRoom.description)) {
                System.out.println(sense.getHero().getDescription() + "使用" + "'" + sense.getHero().getSkill() + "'" + "对" + item.getDescription() + "造成了" + sense.getHero().getAttack() + "点伤害");
                System.out.println(item.getDescription() + "使用" + "'" + item.getSkill() + "'" + "对" + sense.getHero().getDescription() + "造成了" + item.getAttack() + "点伤害");
                if (item.getHP() <= 0) {
                    item.setHP(0);
                    item.setAttack(0);
                    System.out.println("------------------------------------------");
                    System.out.println(item.getDescription() + "已阵亡" + ",恭喜你获得" + item.getRoom() + "的守城令牌！");
                }
            }
        }
        for (Monster item : sense.getMonsterset().getMonsters()) {
            if (sense.getKyx().getHP() == 0 && sense.getMhw().getHP() == 0 && sense.getBls().getHP() == 0) {
                System.out.println("恭喜你成功战胜所有猛兽族，成功收集所有令牌，欢迎回家");
                System.exit(0);
            }
        }
    }

    public void displayHelpMsg() {
        System.out.println("3个指令选择--chop(chop 01) bye help--");
    }


    public void displaybye() {
        System.out.println("下次有缘再聚QaQ。");
        System.exit(0);
    }

    public void displayErrorCmdMsg() {
        System.out.println("你输入无效指令,若遇到困难请输help试试");
    }
}

