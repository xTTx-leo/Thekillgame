package com.xTTx;

public abstract class weapon {
    private int damagePoints;

    public weapon( int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public abstract void useArticle(Creature enemyCreature);

    public weapon() {
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
