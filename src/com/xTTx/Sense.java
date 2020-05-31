package com.xTTx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Sense {
    private Person hero = new Person();
    private Monster mhw = new Monster();
    private Monster kyx = new Monster();
    private Monster bls = new Monster();
    private Monsterset monsterset = new Monsterset();
    private Room currentRoom;
    Ui ui = new Ui();
    map map = new map();

    public void initSense() {
        initPerson();
        initMonster();
    }

    Scanner input = new Scanner(System.in);

    public void initPerson() {
        ui.display1(this);
        System.out.println("请选择你的角色（1.霹雳火，2.超音速，3.力霸天）");
        int character = input.nextInt();
        switch (character) {
            case 1:
                hero.setId("plh");
                hero.setDescription("霹雳火");
                hero.setHP(300);
                hero.setSkill("雷霆半月斩");
                hero.setRoom("nycity");
                hero.setAttack(80);
                hero.setCurrentWeapon(new Attack(-80));
                break;
            case 2:
                hero.setId("cys");
                hero.setDescription("超音速");
                hero.setHP(200);
                hero.setSkill("破空寒冰砍");
                hero.setRoom("nycity");
                hero.setAttack(120);
                hero.setCurrentWeapon(new Attack(-120));
                break;
            case 3:
                hero.setId("lbt");
                hero.setDescription("力霸天");
                hero.setHP(500);
                hero.setSkill("泰山陨石坠");
                hero.setRoom("nycity");
                hero.setAttack(50);
                hero.setCurrentWeapon(new Attack(-50));

                break;
            default:
                System.out.println("没这个英雄啊");
                System.exit(0);
                break;
        }
    }

    public void initMonster() {
        mhw.setId("mhw");
        mhw.setDescription("猛虎王");
        mhw.setHP(200);
        mhw.setSkill("暴风星云裂");
        mhw.setRoom("雷霆殿");
        mhw.setAttack(80);
        mhw.setCurrentWeapon(new Attack(-70));

        kyx.setId("kyx");
        kyx.setDescription("狂野猩");
        kyx.setHP(300);
        kyx.setSkill("狂雷金刚拳");
        kyx.setRoom("狂野之都");
        kyx.setAttack(30);
        kyx.setCurrentWeapon(new Attack(-30));

        bls.setId("bls");
        bls.setDescription("暴龙神");
        bls.setHP(180);
        bls.setSkill("龙皇异次元");
        bls.setRoom("亡灵之都");
        bls.setAttack(90);
        bls.setCurrentWeapon(new Attack(-90));


        monsterset.getMonsters().add(mhw);
        monsterset.getMonsters().add(kyx);
        monsterset.getMonsters().add(bls);
    }


    public void play() {
        System.out.println("你选择的角色是：" + this.getHero().getDescription());
        map.Welcome();
        Scanner in = new Scanner(System.in);
        while (true) {
            String command = in.nextLine();
            String[] words = command.split(" ");
            if (words[0].equals("bye")) {
                ui.displaybye();
                System.exit(0);
            } else if (words[0].equals("help")) {
                ui.displayHelpMsg();
            } else if (words[0].equals("go")) {
                map.goRoom(words[1]);
            } else if (words[0].equals("chop")) {
                 if (this.getMonsterset().get(words[1]).getHP() <= 0) {
                    System.out.println("别个都阵亡了，你还想干嘛？？");
                } else {
                    this.getHero().userArticle(this.getHero().getCurrentWeapon(), this.getMonsterset().get(words[1]));
                    this.getMonsterset().get(words[1]).userArticle(this.getMonsterset().get(words[1]).getCurrentWeapon(), this.getHero());
                    ui.showbattle(this, map);
                }
            }else if(words[0].equals("mega")){
                System.out.println("恭喜你完成超进化，生命力和战斗力都得到了大幅提升，继续去征服猛兽族吧！");
                System.out.println("go east回到狂野之城");
                this.getHero().setHP(500);
                this.getHero().setAttack(140);
                this.getHero().setCurrentWeapon(new Attack(-140));
            }
            else {
                ui.displayErrorCmdMsg();
            }

            ui.displayStaus(this, map);

        }
    }

    public Monsterset getMonsterset() {
        return monsterset;
    }

    public void setMonsterset(Monsterset monsterset) {
        this.monsterset = monsterset;
    }

    public Person getHero() {
        return hero;
    }

    public void setHero(Person hero) {
        this.hero = hero;
    }

    public Monster getMhw() {
        return mhw;
    }

    public void setMhw(Monster mhw) {
        this.mhw = mhw;
    }

    public Monster getKyx() {
        return kyx;
    }

    public void setKyx(Monster kyx) {
        this.kyx = kyx;
    }

    public Monster getBls() {
        return bls;
    }

    public void setBls(Monster bls) {
        this.bls = bls;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}
