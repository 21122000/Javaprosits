import Employe.Employe;
import Employe.*;
public class Main {
    public static void main(String[] args) {

        SocieteArrayList s1=new SocieteArrayList();
        Employe employe=new Employe(5,"bilel","gara","info",2);
        s1.ajouterEmploye(employe);

        Employe employe1=new Employe(1,"bddl","gddda","inddo",2);
        s1.ajouterEmploye(employe1);
        System.out.println( s1.rechercherEmploye("X"));
    System.out.println(s1.rechercherEmploye(employe1));
        s1.trierEmployeParId();
        s1.displayEmploye();
    }
}