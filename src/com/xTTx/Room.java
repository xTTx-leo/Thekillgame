package com.xTTx;

public class Room {
    public String description;
    public String boss;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;

    public Room(String description, String boss) {
        this.description = description;
        this.boss = boss;
    }

    public void setExits(Room north, Room east, Room south, Room west)
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }

    @Override
    public String toString()
    {
        return description;
    }

}
