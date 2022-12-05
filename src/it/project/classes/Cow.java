package it.project.classes;

public class Cow extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Moooo!");
    }

    public Cow(String animalName){
        super(animalName);
    }
}
