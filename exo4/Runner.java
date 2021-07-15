package exo4;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        // On creer la CLI
        CLI cli = new CLI();

        // On creer les options et on les ajoute
        Option optionK = new Option('K', "Valeur de l'indice à calculer", true);
        Option optionP = new Option('P', "Mode matrice pleine", false);

        cli.ajouterOption(optionK);
        cli.ajouterOption(optionP);

        // On creer l'application
        ConfigReduite configReduite = new ConfigReduite();

        // On creer les actions dans le constructeur et on les ajoute dans l'application
        Action actionK = new Action() {
            @Override
            public void faire(String value, Application configReduite) {
                try {
                    ((ConfigReduite)configReduite).setIndice(Integer.parseInt(value));
                } catch (NumberFormatException e) {
                    System.out.println("L'indice doit etre un entier");
                    e.printStackTrace();
                }
            }
        };

        Action actionP = new Action() {
            @Override
            public void faire(String value, Application configReduite) {
                ((ConfigReduite)configReduite).setMode(Mode.PLEINE);
            }
        };
        configReduite.addAction(actionK);
        configReduite.addAction(actionP);


        // On associe les options et les actions
        Map<Option, Action> optionActionMap = new HashMap<>();
        optionActionMap.put(optionK, actionK);
        optionActionMap.put(optionP, actionP);

        // On passe des arguments en dure pour ne pas oublier de les envoyer a l'appel de Runner.main
        // String[] arguments = "-K 10 -A .90 -K 20 -P -K 30 -C".split("\\s+"); // doit afficher que l'option -A est inconnue.
        String[] arguments = "-K 90 -P".split("\\s+");

        // On lance la CLI sur l'application ConfigRéduite
        cli.analyser(configReduite, optionActionMap, arguments);

        // On affiche notre application
        System.out.println(configReduite); // doit afficher : ConfigReduite{indice=90, mode=PLEINE}
    }

}
