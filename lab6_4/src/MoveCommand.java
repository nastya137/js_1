class MoveCommand implements Command {
    private Action action;

    public MoveCommand(Action a) {
        this.action = a;
    }

    public void execute() {
        action.move();
    }
    public void undo() {
        action = null;
        System.out.println("Move was denied");
    }
}
