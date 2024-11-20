package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Dolphin extends Aquatique {
    private float swimmingDepth;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;

    }

    @Override
    public String toString() {
        return super.toString()+" swimmingdepth:" +swimmingDepth;
    }
    public void swim()
    {
        System.out.println("swimmingdepth"+swimmingDepth);
    }


}

