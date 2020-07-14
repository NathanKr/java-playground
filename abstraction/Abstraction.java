public class Abstraction {
    public static void main(String[] args) {
        Animal [] animals = {new Pig() , new Cat()};
        for (Animal animal : animals) {animal.makeSound();}
    }

}