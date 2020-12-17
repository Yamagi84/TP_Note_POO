import Exceptions.ActionNonAutoriseeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Canal implements Comparable<Canal>, Destinataire{

    private Map<Rôle, List<Utilisateur>> mapping_role_utilisateurs;
    private Integer ordre;
    private List<Webhook> webhooks;
    private String nom;
    private Map<Rôle, List<Habilitation>> mapping_role_habilitations;
    private List<Message> historiques;



    public Canal() {
        nom = "canalDiscussion";
        mapping_role_utilisateurs = new HashMap<>();
        mapping_role_habilitations = new HashMap<>();
        historiques = new ArrayList<>();
        ordre = 1;
        webhooks = new ArrayList<>();
    }

    public void ecrireMessage(Utilisateur utilisateur, Message message) throws ActionNonAutoriseeException {

        if((mapping_role_utilisateurs.size() == 0) || (mapping_role_habilitations.size() == 0)) { // Il manque d'autres vérifications comme si l'utilisateur a les droits pour envoyer un message
            throw new ActionNonAutoriseeException();
        }
        //else if (mapping_role_utilisateurs.get(new Rôle("Membre")).contains(utilisateur)) { // Pas bon mais je veux vérifier que l'utilisateur est bien un Membre (juste ça pour le moment)
        //     throw new ActionNonAutoriseeException();
        // }

        message.setAuteur(utilisateur);
        historiques.add(message);
    }

    @Override
    public int compareTo(Canal o) {
        return (this.ordre - o.ordre);
    }



    public Map<Rôle, List<Utilisateur>> getMapping_role_utilisateurs() {
        return mapping_role_utilisateurs;
    }

    public void setMapping_role_utilisateurs(Map<Rôle, List<Utilisateur>> mapping_role_utilisateurs) {
        this.mapping_role_utilisateurs = mapping_role_utilisateurs;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public List<Webhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(List<Webhook> webhooks) {
        this.webhooks = webhooks;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<Rôle, List<Habilitation>> getMapping_role_habilitations() {
        return mapping_role_habilitations;
    }

    public void setMapping_role_habilitations(Map<Rôle, List<Habilitation>> mapping_role_habilitations) {
        this.mapping_role_habilitations = mapping_role_habilitations;
    }

    public List<Message> getHistoriques() {
        return historiques;
    }

    public void setHistoriques(List<Message> historiques) {
        this.historiques = historiques;
    }
}
