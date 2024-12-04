class DatabaseConnection {
    private static DatabaseConnection instance;
    private boolean connection;
    private DatabaseConnection(){}
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance=new DatabaseConnection();
        }
        return instance;
    }
    public void connect(){
        connection = true;
    }
    public void disconnect(){
        connection = false;
    }
    public void getConnectionStatus(){
        if(connection){
            System.out.println("connected");
        }
        else{
            System.out.println("disconnected");
        }
    }
}
