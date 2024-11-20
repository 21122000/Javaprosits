package tn.esprit.gestionzoo.entities;

public interface Omnivore <T> extends Herbivore,Carnivore{
    public void eatPlantAndMeet(T food);
}
