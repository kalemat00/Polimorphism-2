package it.project.classes;

public class Tester {

    public static void main(String...args){
        Animal defaultAnimal = new Animal("Default animal");
        Lion lion1 = new Lion("cane fifone");
        Cow cow1 = new Cow("Lola");

        defaultAnimal.animalSound();
        lion1.animalSound();
        cow1.animalSound();
    }
}
