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





    }
}