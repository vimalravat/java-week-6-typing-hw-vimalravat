import java.util.Scanner;

public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to Java program to add two binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first = scanner.nextLine();
        System.out.println("Please enter second binary number");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumbers(first, second);
        System.out.println("The addition of two binary number is : " + addition);
        scanner.close();
    }


    public static String addTwoBinaryNumbers(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
}
