class Tablet extends Device implements Connectable {
    @Override void TurnOn(){
        IsTurnedOn = !IsTurnedOn;
        if(IsTurnedOn)
            System.out.println("Tablet is ON");
        else System.out.println("Tablet is OFF");
    }
    public void connectToInternet(){
        System.out.println("Phone is connected to Internet");
    }
}
