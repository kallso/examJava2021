package exo4;

import java.util.Set;

public class Application {
    private Set<Action> actions;

    public Application(Set<Action> actions) {
        this.actions = actions;
    }

    public Set<Action> getActions() {
        return actions;
    }

    public void setActions(Set<Action> actions) {
        this.actions = actions;
    }
}
