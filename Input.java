
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int num;


        System.out.println("Введи число");
        do {
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            if (num % 2 == 0)
                System.out.println("Число - четное");
            else
                System.out.println("Число - нечетное");
        }
        while (num != 1.1);


    }
}