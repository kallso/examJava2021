package exo4;

public abstract class Action {
    private Option option;

    Action(Option option) {
        this.option = option;
    }

    abstract public void faire(String value);
}
