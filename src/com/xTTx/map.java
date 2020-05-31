package com.xTTx;

public class map {
    public Room currentRoom;

    public map()
    {
        createRooms();
    }

    public void createRooms(){

        Room nycity, ltd, kyzd, wlzd,hlsg;

        //	制造房间
        nycity = new Room("能源之城","能源");
        ltd = new Room("雷霆殿","猛虎王");
        kyzd = new Room("狂野之都","狂野猩");
        wlzd = new Room("亡灵之都","暴龙神");
        hlsg = new Room("火龙山谷","守护神");
        //	初始化房间的出口
        nycity.setExits(null, ltd, wlzd, kyzd);
        ltd.setExits(null, null, null, nycity);
        kyzd.setExits(null, nycity, null, hlsg);
        wlzd.setExits(nycity, kyzd, null, null);
        hlsg.setExits(null, kyzd, null, null);

        currentRoom = nycity;  //	从能源之城开始
    }

    public void Welcome() {
        System.out.println("现在你在" + currentRoom);
        System.out.print("你可以去（go 方位）:");
        derection();
    }

    private void derection(){
        if(currentRoom.northExit != null)
            System.out.print(currentRoom.northExit+"(north) ");
        if(currentRoom.eastExit != null)
            System.out.print(currentRoom.eastExit+"(east) ");
        if(currentRoom.southExit != null)
            System.out.print(currentRoom.southExit+"(south) ");
        if(currentRoom.westExit != null)
            System.out.print(currentRoom.westExit+"(west) ");
        System.out.println();
    }

    public void goRoom(String direction)
    {
        Room nextRoom = null;
        if(direction.equals("north")) {
            nextRoom = currentRoom.northExit;
        }
        if(direction.equals("east")) {
            nextRoom = currentRoom.eastExit;
        }
        if(direction.equals("south")) {
            nextRoom = currentRoom.southExit;
        }
        if(direction.equals("west")) {
            nextRoom = currentRoom.westExit;
        }

        if (nextRoom == null) {
            System.out.println("你不能去那边");
        }
        else {
            currentRoom = nextRoom;
            System.out.println("你在" + currentRoom);
            System.out.print("你可以去（go 方位）: ");
           derection();
        }
    }
}
