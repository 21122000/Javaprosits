package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private int nbrCage;
    private Animal[] animals;
    private Aquatique[] aquaticAnimals=new Aquatique[10];
    public Zoo(String name,String city,int nbrCage){

        if (name!="") {
            this.name = name;
            this.city = city;
            this.nbrCage = nbrCage;
            animals =new Animal[nbrCage];
        }else System.out.println("le nom ne peut pas etre vide");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCage() {
        return nbrCage;
    }

    public void setNbrCage(int nbrCage) {
        this.nbrCage = nbrCage;
    }
    public void ajouterAnimal(Animal animal) throws ZooFullException{
        int nbrAnimals=0;
        if (searchAnimal(animal) != -1)
            System.out.println("This animal already exist");
        if (isZooFull()){
            throw new ZooFullException("The Zoo is full");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;

    }
    public void afficheAnimal(){
        for (int i =0;i< animals.length;i++)
        {
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal (Animal animal){
        for (int i=0;i< animals.length;i++)
        {
            if (animals[i]!=null &&animals[i].getName().equals(animal.getName()))
            {
                return 1;
            }
        }
        return -1;
    }
    public boolean isZooFull() {
        int nbrCasePlein = 0;

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null)
                nbrCasePlein++;
        }
        if (nbrCasePlein < animals.length) {
            return false;
        }else
            return true;

    }
    public Zoo Comparer(Zoo zoo1,Zoo zoo2){
        int nbrAzoo1=0;
        int nbrAzoo2=0;
        for (int i=0;i<zoo1.animals.length;i++){
            if(zoo1.animals[i]!=null){
                nbrAzoo1++;
            }

        }
        for (int i=0;i<zoo2.animals.length;i++){
            if(zoo2.animals[i]!=null){
                nbrAzoo2++;
            }
        }
        if (nbrAzoo1<nbrAzoo2)
        return zoo2;
        else return zoo1;

    }

    @Override
    public String toString() {
        return "name :"+name+" nbrCage :"+nbrCage+" city:"+city;
    }
    public void addAquaticAnimal(Aquatique aquatic){

            int i = 0;
            while (aquaticAnimals[i]!=null){
                i++;
            }
            aquaticAnimals[i]=aquatic;


    }
public void AfficherAquatique(){
    for (int i =0;i< aquaticAnimals.length;i++)
    {
        System.out.println(aquaticAnimals[i]);
    }

}
public float maxPenguinSwimmingDepth(){
        float maxSpeed=0;
        float maxspeed1=0;

        for(Aquatique A :aquaticAnimals) {

            if (A instanceof Penguin penguin) {
                maxSpeed = penguin.getSwimmingSpeed();
            }
            if(maxSpeed>maxspeed1)
                maxspeed1=maxSpeed;

        }
            return maxspeed1;
}
public void displayNumberOfAquaticsByType(){
        int nbrPenguin=0;
        int nbrDelphin=0;
        for(Aquatique a : aquaticAnimals)
        {
            if (a instanceof Dolphin)
            {
                nbrDelphin++;
            }
            if (a instanceof Penguin)
            {
                nbrPenguin++;
            }
        }
        System.out.println("le nombre de delphin est "+nbrDelphin + "le nombre de Penguin est" +nbrPenguin);
}
}
