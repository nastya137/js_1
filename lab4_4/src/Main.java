import java.util.ArrayList;
import java.util.Arrays;
class Vehicle {
    double velocity;
    Vehicle(double velocity) {
        this.velocity = velocity;
    }
    Vehicle() {
        this.velocity = 0;
    }
    void move(){
        System.out.println(velocity);
    }
//    void setVelocity(double vel){
//        velocity = vel;
//    }
    double getVelocity(){
        return velocity;
    }
}

class Car extends  Vehicle{
    void acclerate(double v){
        if (v>0)
        this.velocity = v;
        else this.velocity = 0;
    }
}
class Bike extends  Vehicle{
    void acclerate(double v){
        if (v>0)
        this.velocity = v;
        else this.velocity = 0;
    }
}
class Truck extends  Vehicle{
    void loadCargo(double v){
        if (v>0)
        this.velocity = v;
        else this.velocity = 0;
    }
}

class Garage {
    ArrayList<Vehicle> vehicles;
    void add(Vehicle v ){
        this.vehicles.add(v);
    }
    void pop (int i){
        this.vehicles.remove(i);
    }
    void changeVelocity(double v, int i){
        this.vehicles.get(i).velocity = v;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}