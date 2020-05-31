package com.xTTx;

public class Monster extends Creature{
    @Override
    public void userArticle(weapon weapon, Creature targetCreature) {
   weapon.useArticle(targetCreature);
    }
}
