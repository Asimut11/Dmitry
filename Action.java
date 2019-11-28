package Doges;

public class Action {
    public static void main(String[] args) {
        Dog ourdog = new Dog();
        ourdog.eat();
        String say = ourdog.say("Wof...");
        System.out.println(say);
    }
}
