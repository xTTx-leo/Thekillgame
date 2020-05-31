package com.xTTx;

import java.util.ArrayList;

public abstract class Creature {
    private String id;
    private String description;
    private String skill;
    private String room;
    private int HP;
    private int Attack;
    private weapon currentWeapon;
    private ArrayList<weapon> weapons=new ArrayList<weapon>();

    public weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
    public abstract void userArticle(weapon weapon, Creature targetCreature);

    public ArrayList<weapon> getWeapons() {
        return weapons;
    }


    public void setWeapons(ArrayList<weapon> weapons) {
        this.weapons = weapons;
    }

    public String getId() {
        return id;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }


}
