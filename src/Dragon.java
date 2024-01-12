public class Dragon {
    private int health;
    private int level;

    public Dragon() {
        health = 100;
        level = (int)(Math.random()*3)+1;
    }

    public int atk() {
        if (level == 1) {
            return 5;
        } else if (level == 2) {
            return 10;
        } else {
            return 15;
        }
    }
}
