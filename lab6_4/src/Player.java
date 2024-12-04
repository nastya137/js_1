class Player implements Observer {
    private String name;
    boolean isOnline;
    public Player(String name) {
        this.name = name;
    }
    public void logIn(){
        isOnline=true;
    }
    public void quit(){
        isOnline=false;
    }
    public void isOnline() {
        if(isOnline)
            System.out.println(name + " is online");
        else
            System.out.println(name + " is not online");
    }
}
