package exo4;

public class Option {
    private char acces;
    private String description;
    private boolean valeur;

    public Option(char acces, String description, boolean valeur) {
        this.acces = acces;
        this.description = description;
        this.valeur = valeur;
    }

    public char getAcces() {
        return acces;
    }

    public void setAcces(char acces) {
        this.acces = acces;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getValeur() {
        return valeur;
    }

    public void setValeur(boolean valeur) {
        this.valeur = valeur;
    }
}
