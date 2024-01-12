public class Sword {
    private int atk;
    private int dodge;

    public Sword() {
        atk = 10;
        dodge = 20;
    }

    public int dmg() {
        if (((int)(Math.random()*10)+1) == 10) {
            return 2*atk;
        }
        return atk;
    }
}
