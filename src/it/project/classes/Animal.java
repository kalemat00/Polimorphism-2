package it.project.classes;

public class Animal {
    private String animalName;


    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.println("Default animal sound");
    }
}
