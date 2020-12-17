import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServeurDiscussion {

    private Map<Rôle, List<Utilisateur>> mapping_role_utilisateur;
    private List<Canal> canaux;
    private String nom;
    private Map<Rôle, List<Habilitation>> mapping_role_habitations;

    public ServeurDiscussion() {
        nom = "ServeurDiscussion";
        canaux.add(new Canal());
        mapping_role_utilisateur = new HashMap<>();
        mapping_role_habitations = new HashMap<>();
    }



    public Map<Rôle, List<Utilisateur>> getMapping_role_utilisateur() {
        return mapping_role_utilisateur;
    }

    public void setMapping_role_utilisateur(Map<Rôle, List<Utilisateur>> mapping_role_utilisateur) {
        this.mapping_role_utilisateur = mapping_role_utilisateur;
    }

    public List<Canal> getCanaux() {
        return canaux;
    }

    public void setCanaux(List<Canal> canaux) {
        this.canaux = canaux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<Rôle, List<Habilitation>> getMapping_role_habitations() {
        return mapping_role_habitations;
    }

    public void setMapping_role_habitations(Map<Rôle, List<Habilitation>> mapping_role_habitations) {
        this.mapping_role_habitations = mapping_role_habitations;
    }
}
