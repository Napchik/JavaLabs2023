import java.util.Scanner;

public class Main {

    public static int valuein(String message){
        Scanner getFromConsole = new Scanner(System.in);
        int value;
        while (true) {
            try{
                System.out.println("Enter " + message + ":");
                value = getFromConsole.nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("error try again");
                getFromConsole.next();
            }
        }
        return value;
    }

    public static void main(String[] args) {

        // Вхідні дані: №1328
        //C2 = 1328 % 2; // O1 - "+"
        //C3 = 1328 % 3; // C = 2
        //C5 = 1328 % 5; // O2 - "+"
        //C7 = 1328 % 7; // type - float

        int C = 2, a, b, n, m;

        // Отримуємо змінні a, b, n, m від користувача
        a = valuein("a(integer)");
        n = valuein("n(integer)");
        b = valuein("b(integer)");
        m = valuein("m(integer)");

        // Перевіряємо дані та рахуємо за формулою
        if (a > n || b > m) {
            System.out.println("Mistake! (a>n or b>m)");
        } else if (-C <= n && -C >= a) {
            System.out.println("Error! Division by 0!");
        } else {
            float sum = 0;
            for (int i = a; i <= n; i++) {
                for (int j = b; j <= m; j++) {
                    sum += (i + j) / (i + C);
                }
            }
            System.out.printf("S = %f", sum);
        }
    }
}
