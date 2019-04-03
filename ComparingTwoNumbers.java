import java.util.Scanner;

public class ComparingTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        do {
            System.out.println("Введите поочередно несколько чисел:");
            s.hasNextInt();
            a.hasNextInt();
            int number1 = s.nextInt();
            int number2 = a.nextInt();
            if (number1 > number2) {
                System.out.println("number1 > number2");
            } else {
                System.out.println("number1 < number2");
            }
        }
        while (true);
    }
}