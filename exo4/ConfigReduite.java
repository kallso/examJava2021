package exo4;

import java.util.Set;

public class ConfigReduite extends Application {
    private int indice = 150;
    private Mode mode = Mode.CREUSE;

    public ConfigReduite() {
    }

    public ConfigReduite(int indice, Mode mode) {
        this.indice = indice;
        this.mode = mode;
    }

    public ConfigReduite(Set<Action> actions, int indice, Mode mode) {
        super(actions);
        this.indice = indice;
        this.mode = mode;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "ConfigReduite{" +
                "indice=" + indice +
                ", mode=" + mode +
                '}';
    }
}
