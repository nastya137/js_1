import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целые числа x и y");
        Variables.var();
        System.out.println("Введите целые числа a и b");
        Expression.expr();
        System.out.println("Введите целое число x");
        Branch.br();
    }
}

class Variables{
    public static void var() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x + y > 20) {
            System.out.println("3*x^2 = "+pow(x, 2) * 3);
        } else {
            System.out.println("y^3 = "+pow(y, 3));
        }
    }
}
class Expression{
    public static int max(int a, int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int min(int a, int b){
        if (a<b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void expr() {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            double d;
            d = (max(2*a, b)-10*sqrt(min(a, 4+b))+4.2*min(a, 4+b))/(1+(max(2*a, b)/min(a, 4+b)));
            System.out.println("Результат вычислений: "+d);
    }
}

class Branch {
    public static void br(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y, f;
        if (x <= 1) {
            y = pow(x, 5) + atan(x);
            f = exp(tan(x) + 1);
        } else if ((x <= 2) && (x > 1)) {
            y = 5 * x - (1 + pow(3, x));
            f = pow(x, 4) - tan(4 * x);
        } else {
            y = 1 / tan(2 * x + 1);
            f = pow(x, 1.0 / 3.0);
        }
        System.out.println("y(x) = "+y);
        System.out.println("f(x) = "+f);
    }
        }
