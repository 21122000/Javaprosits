package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Animal animal1=new Animal("cat","mimi",10,true);
        Animal animal2=new Animal("chien","caniche",10,true);
        Animal animal3=new Animal("lion","leroi",10,true);
        Zoo zoo=new Zoo("belvidaire","tounes",5);
        Zoo zoo1=new Zoo("zimbra","italya",5150);
        zoo.ajouterAnimal(animal1);
        zoo.ajouterAnimal(animal2);
        zoo.ajouterAnimal(animal3);
        zoo1.ajouterAnimal(animal3);
        zoo.afficheAnimal();
        System.out.println ("le zoo qui contient le plus nbr animal est : "+zoo.Comparer(zoo1,zoo));
        Dolphin dolphin=new Dolphin(" poisson","imed",5,true,"piscine",20);
        zoo.ajouterAnimal(dolphin);
        zoo.afficheAnimal();
        System.out.println("********prosit 6 *************");
        zoo.addAquaticAnimal(dolphin);
        Aquatique penguin1=new Penguin("betri9a","zwarta",21,true,"neige",100000);
        Dolphin dolphin1=new Dolphin(" poissonaa","imeda",5,true,"piscine",32);
        Aquatique penguin=new Penguin("betri9","zwart",21,true,"neige",30202);
        zoo.addAquaticAnimal(penguin);
        zoo.addAquaticAnimal(dolphin1);
        zoo.addAquaticAnimal(penguin1);
        zoo.AfficherAquatique();
        System.out.println(zoo.maxPenguinSwimmingDepth());
        System.out.println(penguin.equals(penguin1));


    }
}