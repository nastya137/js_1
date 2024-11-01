import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Номера случайных значений массива с разрешёнными значениями");
        ReciprocalFraction();
        System.out.println("2. Отрицательные упорядоченные элементы массива");
        start();
        System.out.println("3. Вектор максимальных значений каждого столбца");
        buildVector();
        System.out.println("4. Действия над матрицами");
        MatrixActions();

    }

    public static double[] CreateReciprocalFraction(double[] n, int amount) {
        double m[] = new double[amount];
        for (int i = 0; i < amount; i++) {
            try {
                m[i] = 1 / n[i];
            } catch (ArithmeticException e) {
                m[i] = 0;
            }
        }
        return m;
    }

    public static void ReciprocalFraction() {
        double[] nums = new double[200];
        double[] permitted = new double[]{0.04, -0.013333333333333334, -0.08333333333333333, -0.025, 0.01818181818181818, 0.043478260869565216, 0.025};
        for (int i = 0; i < 200; i++) {
            nums[i] = Math.round(-99 + Math.random() * (99 - (-99) + 1));
        }
        double[] m = new double[200];
        m = CreateReciprocalFraction(nums, 200);
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 7; j++) {
                if (m[i] == permitted[j])
                    System.out.println(i);
            }
        }
        System.out.print("\n");
    }

        public static void start() {
            double b[] = new double[20];
            double C1[] = new double[20];
            int non_zero = 0;
            for (int i = 0; i < 20; i++) {
                b[i] = (-10 + Math.random() * (10 + 10 + 1));
                if (b[i] < 0) {
                    C1[i] = b[i] * 4;
                    non_zero++;
                }
            }
            double C[] = new double[non_zero];
            non_zero = 0;
            for (int i = 0; i < 20; i++) {
                if (C1[i] != 0) {
                    C[non_zero] = C1[i];
                    non_zero++;
                }
            }
            Arrays.sort(C);
            for (int i = 0; i < non_zero; i++) {
                System.out.print(C[i] + "\n");
            }
            System.out.print("\n");
        }



        public static void buildVector() {
            double matrix[][] = new double[5][5];
            double vector[] = new double[5];
            double max = 0;
            Scanner console = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    matrix[i][j] = Math.random() * 100;
                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (matrix[i][j] > vector[i]) {
                        vector[i] = matrix[i][j];
                    }
                }
            }
            for (int i = 0; i < 5; i++) {
                System.out.print(vector[i] + " ");
            }
            System.out.print("\n\n");
        }

        public static void MatrixActions() {
            double matrix[][] = new double[5][5];
            double max = 0;
            double min = 10;
            Scanner console = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    matrix[i][j] = Math.round(Math.random() * 10);
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }
            for (int i = 0; i < 5; i++) {
                if (matrix[i][i] > max) {
                    max = matrix[i][i];
                }
            }
            for (int i = 0; i < 5; i++) {
                if (matrix[i][i] < min) {
                    min = matrix[i][i];
                }
            }
            System.out.println(min + "*" + max + "=" + (min * max));
            for (int i = 0; i < 5; i++) {
                System.out.println(max + "*" + matrix[i][4 - i] + "=" + (matrix[i][4 - i] * max));
            }
        }


}
