package Employe;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{

    List<Employe> employes=new ArrayList<>();
    public void ajouterEmploye(Employe E)
    {
        employes.add(E);
    }
    public void displayEmploye()
    {
        System.out.println(employes);
    }
    public boolean rechercherEmploye(String nom)
    {
        for(Employe E : employes)
        {
            if(E.getNom().equals(nom))
            return true;
        }
         return false;
    }
    public boolean rechercherEmploye(Employe employe)
    {
        return employes.contains(employe);
    }
    public void supprimerEmploye(Employe employe)
    {
        employes.remove(employe);
    }
    public void trierEmployeParId()
    {
        Collections.sort(employes);
    }
    public void trierEmployeParNomDépartementEtGrade()
    {
        Collections.sort(employes, (new ComparatorParGrade())
                .thenComparing(new ComparatorParNomDepartement()));

    }




}
