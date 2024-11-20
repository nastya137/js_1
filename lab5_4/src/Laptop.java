class Laptop extends Device{
    @Override void TurnOn(){
        IsTurnedOn = !IsTurnedOn;
        if(IsTurnedOn)
            System.out.println("Laptop is ON");
        else System.out.println("Laptop is OFF");
    }
}
