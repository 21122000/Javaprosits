package Employe;

import java.util.Comparator;

public class ComparatorParNomDepartement implements Comparator<Employe> {
    public int compare(Employe e1,Employe e2)
    {
        return e1.getNom_de_departement().compareTo(e2.getNom_de_departement());
    }
}
