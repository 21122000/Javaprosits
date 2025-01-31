public class Zoo {
    private Animal[] animals=new Animal[25];
    private String name;
    private String city;
    private int nbrCage;
    public Zoo(String name,String city,int nbrCage){
        this.name = name;
        this.city =city;
        this.nbrCage =nbrCage;

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
    public void ajouterAnimal(Animal animal) {
        int i = 0;
        while (animals[i]!=null){
            i++;
        }
        if((searchAnimal(animal) == -1 && isZooFull()) == false)
        animals[i]=animal;

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
}
