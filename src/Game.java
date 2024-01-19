import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);
    private Player player;
    private Room[] rooms;

    private boolean alive;

    public Game() {
        player = new Player();
        Room room1 = new Room("The Lair");
        Room room2 = new Room("The Hatchery");
        Room room3 = new Room("The Den");
        Room room4 = new Room("The Cave");
        Room room5 = new Room("The Forest");
        rooms = new Room[]{room1, room2, room3, room4, room5};
        alive = true;
    }

    public int score() {
        int score = 0;
        for (Room dra : rooms) {
            if (dra.getDragon().getHealth() == 0) {
                if (dra.getDragon().getLevel() == 1) {
                    score += 100;
                }
                if (dra.getDragon().getLevel() == 2) {
                    score += 150;
                }
                if (dra.getDragon().getLevel() == 3) {
                    score += 200;
                }
            }
        }
        return score;
    }
    public void gameplay() {
        while (alive) {

        }
    }

    public void mainMenu() {
        int choice = 0;
        System.out.println("Welcome! Here are your options:\n(1) New Game\n(2) View Score\n (3) Quit");
        choice = scan.nextInt();
        if (choice == 1) {
            gameplay();
        } else if(choice == 2) {
            System.out.println(score());
        } else if (choice == 3) {
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
    }
}
