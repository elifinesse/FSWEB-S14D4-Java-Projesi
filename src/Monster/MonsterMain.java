package Monster;


public class MonsterMain {
    public static void main(String[] args) {
        Monster troll = new Troll("cave troll", 100, 10);

        Monster dragon = new Dragon("smaug", 1000, 100);

        System.out.println(troll.attack());
        System.out.println(dragon.attack());
    }
}
