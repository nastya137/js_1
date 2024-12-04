class Application{
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doCommand() {
        command.execute();
    }
    public void undoCommand() {
        command.undo();
    }
}

