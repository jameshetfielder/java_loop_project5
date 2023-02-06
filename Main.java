import javax.sound.midi.Soundbank;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 1, i = 1, num1, num2;

        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter power ratio: ");
        num2 = input.nextInt();

        for (i = 1; i <= num2; i++) {
            result *= num1;
        }
        System.out.print("Result: " + num1 + "^" + num2 + "=" + result);
    }
    }
