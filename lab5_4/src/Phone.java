class Phone  extends Device implements Connectable{
    @Override void TurnOn(){
        IsTurnedOn = !IsTurnedOn;
        if(IsTurnedOn)
        System.out.println("Phone is ON");
        else System.out.println("Phone is OFF");
    }
    public void connectToInternet(){
        System.out.println("Phone is connected to Internet");
    }
}
