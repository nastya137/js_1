package MVVM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyViewModel vm = new CurrencyViewModel();
        CurrencyView view = new CurrencyView();
        Scanner sc = new Scanner(System.in);
        vm.addCurrency("USD", 100.0);
        vm.addCurrency("EUR", 90.0);
        vm.addCurrency("CNY", 0.071481);
        System.out.println("Currency rate today:");
        view.output(vm.getCurrencies());
        System.out.println("Enter currency Name: ");
        String name = sc.nextLine();
        System.out.println("Enter new currency rate: ");
        Double newRate = sc.nextDouble();
        try{
        vm.changeRate(name, newRate);
        System.out.println("New currency rate:");
        view.output(vm.getCurrencies());}
        catch(InputMismatchException e){
            System.out.println("Wrong input");
        }
    }
}
