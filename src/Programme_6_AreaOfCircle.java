import java.util.Scanner;

public class Programme_6_AreaOfCircle {





        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Radius : ");
            double radius = scanner.nextDouble();
            areaOfCircle(radius);

            scanner.close();
        }


        public static void areaOfCircle(double radius) {
            double pi = Math.PI;
            double area = (pi * radius * radius);
            System.out.println("The Area of Circle is : " + area);
        }
    }


