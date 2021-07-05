import javax.swing.*;
import java.awt.*;

public class IHM_CLI {

    public IHM_CLI() {
        JFrame fenetre = new JFrame("IHM pour CLI");
        JButton jButtonCreuse = new JButton("Creuse (C)");
        JButton jButtonPleine = new JButton("Pleine (P)");
        JLabel jLabelIndice = new JLabel("Valeur de l'indice (K)");
        JTextField jTextFieldIndice = new JTextField();
        JButton jButtonIndice = new JButton("+");
        JLabel jLabelAlpha = new JLabel("Valeur de alpha (A)");
        JTextField jTextFieldAlpha = new JTextField();
        JButton jButtonAlpha = new JButton("+");
        JLabel jLabelEpsilon = new JLabel("Valeur de epsilon (E)");
        JTextField jTextFieldEpsilon = new JTextField();
        JButton jButtonEpsilon = new JButton("+");
        JTextArea command = new JTextArea();

        fenetre.setLayout(new BorderLayout());

        JPanel buttons = new JPanel();

        buttons.add(jButtonCreuse);
        buttons.add(jButtonPleine);

        fenetre.add(buttons, BorderLayout.NORTH);

        JPanel options = new JPanel();
        options.setLayout(new GridLayout(3,3));
        options.add(jLabelIndice);
        options.add(jTextFieldIndice);
        options.add(jButtonIndice);
        options.add(jLabelAlpha);
        options.add(jTextFieldAlpha);
        options.add(jButtonAlpha);
        options.add(jLabelEpsilon);
        options.add(jTextFieldEpsilon);
        options.add(jButtonEpsilon);

        fenetre.add(options, BorderLayout.CENTER);

        command.setEditable(false);
        fenetre.add(command, BorderLayout.SOUTH);

        // Action Listeners
        jButtonCreuse.addActionListener(e -> command.append("-C "));

        jButtonPleine.addActionListener(e -> command.append("-P "));

        jButtonIndice.addActionListener(e -> command.append("-K " + jTextFieldIndice.getText() + " "));

        jButtonAlpha.addActionListener(e -> command.append("-A " + jTextFieldAlpha.getText() + " "));

        jButtonEpsilon.addActionListener(e -> command.append("-E " + jTextFieldEpsilon.getText() + " "));

        fenetre.pack();
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        IHM_CLI ihm_cli = new IHM_CLI();
    }
}
