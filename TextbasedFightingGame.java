public class TextbasedFightingGame {
    private String name;
    private int health;
    private int attackPower;

    public TextbasedFightingGame(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(TextbasedFightingGame opponent) {
        opponent.health -= this.attackPower;
        System.out.println(this.name + " attacks " + opponent.name + " for " + this.attackPower + " damage!");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public static void main(String[] args) {
        TextbasedFightingGame fighter1 = new TextbasedFightingGame("Ali", 100, 20);
        TextbasedFightingGame fighter2 = new TextbasedFightingGame("Aisha", 120, 15);

        while (fighter1.isAlive() && fighter2.isAlive()) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
            System.out.println(fighter1.getName() + "'s remaining health: " + fighter1.getHealth());
            System.out.println(fighter2.getName() + "'s remaining health: " + fighter2.getHealth());
            System.out.println();
        }

        if (fighter1.isAlive()) {
            System.out.println(fighter1.getName() + " wins!");
        } else {
            System.out.println(fighter2.getName() + " wins!");
        }
    }
}
