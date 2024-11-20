package Employe;

public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private String nom_de_departement;
    private int grade;

    public Employe(int id, String nom, String prenom, String nom_de_departement, int grade) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_de_departement = nom_de_departement;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_de_departement() {
        return nom_de_departement;
    }

    public void setNom_de_departement(String nom_de_departement) {
        this.nom_de_departement = nom_de_departement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_de_departement='" + nom_de_departement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null) return false;
        if(obj instanceof Employe employe)
        {
            return employe.id==id&& employe.nom.equals(nom);

        }
        return false;
    }

    @Override
    public int compareTo(Employe e)
    {
        return id-e.id;
    }

}
