package com.xTTx;

import java.util.ArrayList;

public class Monsterset {
    private ArrayList<Monster> monsters = new ArrayList<>();

    public Monsterset() {
    }

    public Monster get(String id){
        Monster monsterWolf=null;
        for (Monster item: monsters){
            if(true==id.equals(item.getId())){
                monsterWolf=item;
                break;
            }
        }
        return monsterWolf;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }
}
