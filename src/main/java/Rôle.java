public class Rôle {

    private String nomRôle;

    public Rôle(String role) {
        this.nomRôle = role;
    }

    public boolean equals(Rôle object) {
        return (this.nomRôle == object.nomRôle);
    }

    public int hashCode() {
        if (nomRôle == null) return 0;
        else return nomRôle.length();
    }



    public String getNomRôle() {
        return nomRôle;
    }

    public void setNomRôle(String nomRôle) {
        this.nomRôle = nomRôle;
    }
}
