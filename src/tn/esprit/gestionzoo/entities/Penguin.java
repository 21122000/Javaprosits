package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatique {
    private float swimmingSpeed;
    public Penguin (String family,String name,int age , boolean isMammal , String habitat , float swimmingSpeed)
    {
        super(family,name, age ,isMammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+" swimmingspeed :"+swimmingSpeed;
    }
    public void swim()
    {
        System.out.println("swimmingdspeed"+swimmingSpeed);
    }
}
