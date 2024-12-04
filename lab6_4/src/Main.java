public class Main {
    public static void main(String[] args) {
        DatabaseConnection singleton = DatabaseConnection.getInstance();
        singleton.connect();
        singleton.getConnectionStatus();

        LevelFactory lvlfactory = new LevelFactory();
        Level easyLevel = lvlfactory.createLevel("easy");
        easyLevel.generate();

        OnlineStatusManager subject = new OnlineStatusManager ();
        Observer player1 = new Player("Observer1");
        Observer player2 = new Player("Observer2");
        player1.logIn();
        subject.addObserver(player1);
        subject.addObserver(player2);
        subject.notifyObservers();

        Action test = new Action();
        Command move = new MoveCommand(test);
        Application a = new Application();
        a.setCommand(move);
        a.doCommand();
        a.undoCommand();

        IType building = BuildingFactory.getBuilding(1);
        building.knowType();

    }
}
