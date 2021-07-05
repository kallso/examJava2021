import exo4.CLI;
import exo4.Option;

import java.lang.reflect.Field;

public class CLIOutils {

    static public CLI fromClass(String nomDeClasse) throws ClassNotFoundException {
        CLI cli = new CLI();
        Class<?> theClass = Class.forName(nomDeClasse);

        for (Field field : theClass.getDeclaredFields()) {
            Option option = new Option(
                    field.getName().charAt(0),
                    "Valeur de " + field.getName(),
                    !field.getType().isEnum()
            );

            cli.ajouterOption(option);
        }
        return cli;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        CLIOutils.fromClass("Configuration");
    }
}
