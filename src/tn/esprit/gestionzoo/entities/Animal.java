package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal (String family,String name,int age , boolean isMammal)
    {
        if(age>0) {
            this.family = family;
            this.name = name;
            this.age = age;
            this.isMammal = isMammal;
        }else
            System.out.println("le age ne peut etre negatif");
   }
   public String getFamily(){return family;}
   public String getName(){return this.name;}
   public int getAge(){return age;}
   public boolean getIsMammam(){return isMammal;}

   public void setFamily (String Family){this.family=family;}
   public void setName (String name){this.name=name;}
   public void setAge (int age){this.age=age;}
    public void setMammal(boolean mammal) {isMammal = mammal;}

    @Override
    public String toString() {
        return "family :"+family+" age :"+age+" name :"+name+" Ismammal :"+isMammal;
    }
}
