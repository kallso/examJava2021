package exo4;

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

        // On creer les actions et on les ajoute dans l'application
        Action actionK = new Action(optionK) {
            @Override
            public void faire(String value) {
                configReduite.setIndice(Integer.parseInt(value));
            }
        };

        Action actionP = new Action(optionK) {
            @Override
            public void faire(String value) {
                configReduite.setMode(Mode.PLEINE);
            }
        };

        // On associe action a l'application
        configReduite.addAction(actionK);
        configReduite.addAction(actionP);
    }

}
