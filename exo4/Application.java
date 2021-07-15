package exo4;

import java.util.HashSet;
import java.util.Set;

public abstract class Application {
    private Set<Action> actions = new HashSet<>();

    public Application() {
    }

    public Application(Set<Action> actions) {
        this.actions = actions;
    }

    public Set<Action> getActions() {
        return actions;
    }

    public void setActions(Set<Action> actions) {
        this.actions = actions;
    }

    public void addAction(Action action) {
        actions.add(action);
    }

    @Override
    public String toString() {
        return "Application{" +
                "actions=" + actions +
                '}';
    }
}
