package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class  Aquatique extends Animal implements Carnivore<Food> {
    private String habitat;

    public Aquatique (String family,String name,int age , boolean isMammal , String habitat)
    {
        super(family,name, age ,isMammal);
        this.habitat=habitat;
    }
    public abstract  void  swim ();

    public boolean equals(Object obj )
    {
        if (obj==null)return false;
        if (this==obj)return  true;
        if(obj instanceof Aquatique aquatique)
        {
            return aquatique.habitat.equals(habitat)&& aquatique.getName().equals(super.getName())&&aquatique.getAge()==super.getAge();
        }
return false;
    }

}
