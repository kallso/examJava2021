package exo4;

import java.util.HashSet;
import java.util.Set;

public class CLI {
    private Set<Option> options = new HashSet<>();

    public CLI() {
    }

    public CLI(Set<Option> options) {
        this.options = options;
    }

    public static Application analyser(Application application, String... args) {
        /*boolean finOptions = false;
        int i = 0;
        while (i < args.length && ! finOptions) {
            String arg = args[i];
            switch (arg) {
                case "-K": // Valeur de l'indice à calculer
                    try {
                        appli.setIndice(Integer.parseInt(args[++i]));
                    } catch (NumberFormatException e) {
                        System.out.println("L'indice doit etre un entier");
                        e.printStackTrace();
                    }
                    break;
                case "-E": // Valeur de la précision à atteindre
                    try {
                        appli.setEpsilon(Double.parseDouble(args[++i]));
                    } catch (NumberFormatException e) {
                        System.out.println("L'epsilon doit etre un decimal");
                        e.printStackTrace();
                    }
                    break;
                case "-A": // Valeur de alpha
                    try {
                        appli.setAlpha(Double.parseDouble(args[++i]));
                    } catch (NumberFormatException e) {
                        System.out.println("L'alpha doit etre un decimal");
                        e.printStackTrace();
                    }
                    break;
                case "-C": // Mode matrice creuse
                    appli.setMode(Mode.CREUSE);
                    break;
                case "-P": // Mode matrice pleine
                    appli.setMode(Mode.PLEINE);
                    break;
                default:
                    finOptions = arg.length() == 0 || arg.charAt(0) != '-';
                    if (! finOptions) {
                        System.out.println("Option inconnue : " + arg);
                    }
            }
            i++;
        }*/
        return application;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }

    public void ajouterOption(Option option) {
        options.add(option);
    }
}
