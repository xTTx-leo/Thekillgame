package com.xTTx;

public class Attack extends weapon {
    public Attack(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public void useArticle(Creature enemyCreature) {

        enemyCreature.setHP(enemyCreature.getHP()+this.getDamagePoints());
    }
}

