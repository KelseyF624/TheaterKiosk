import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TheaterKiosk {
    public static void main(String[] args) {
        int age = 0;
        int DRINKING_AGE = 21;
        System.out.println("Welcome to the Theater Kiosk! Please enter your age: ");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();
        if (age >= DRINKING_AGE) {System.out.println("Congratulations you can drink! Here is your wristband, please drink responsibly.");}
    }
}