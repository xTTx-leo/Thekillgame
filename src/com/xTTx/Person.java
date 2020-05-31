package com.xTTx;

public class Person extends Creature{
    @Override
    public void userArticle(weapon weapon, Creature targetCreature) {
        weapon.useArticle(targetCreature);
    }
}
