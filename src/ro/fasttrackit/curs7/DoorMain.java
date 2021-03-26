package ro.fasttrackit.curs7;

public class DoorMain {
    public static void main(String[] args) {
        Door door = new Door();
        door.open();
        System.out.println(door);
        door.unlock();
        door.open();
        System.out.println(door);
    }
}
