class AttackCommand implements Command {
    private Action action;
    public AttackCommand(Action a) {
        this.action = a;
    }

    public void execute() {
        action.attack();
    }
    public void undo() {
        action = null;
        System.out.println("Attack was denied");
    }
}
