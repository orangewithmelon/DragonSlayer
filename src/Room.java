public class Room {
    private Dragon dragon;

    private String name;

    public Room(String str) {
        dragon = new Dragon();
        name = str;
    }

    public Dragon getDragon() {
        return dragon;
    }
}
