import exo4.CLI;
import exo4.Option;
import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.FileOutputStream;

public class SerialiseurXML {

    public static void main(String[] args) throws java.io.IOException {
        CLI cli = new CLI();
        cli.ajouterOption(new Option('A', "Valeur de alpha", true));
        cli.ajouterOption(new Option('I', "Valeur de indice", true));
        cli.ajouterOption(new Option('P', "Mode matrice pleine", false));
        cli.ajouterOption(new Option('C', "Mode matrice creuse", false));

        // Construire le document
        Element racine = new Element("cli");

        for (Option option : cli.getOptions()) {
            Element argument = new Element("argument").setAttribute("acces", String.valueOf(option.getAcces()));
            if (option.getValeur()) argument.setAttribute("nb", "1");
            argument.setText(option.getDescription());
            racine.addContent(argument);
        }

        Document document = new Document(racine, new DocType("cli", "cli.dtd"));

        // Afficher le document
        XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
        sortie.output(document, new FileOutputStream("cli.xml"));
    }
}
