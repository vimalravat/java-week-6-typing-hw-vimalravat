import java.util.Scanner;

public class Programme_14_AreaAndPerimeter {
    public static void areaAndPerimeterOfRectangle(int height, int width) {
        int perimeter = 2 * (height + width);
        int area = (height * width);
        System.out.println("The area of the rectangle is : " + area);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int height = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int width = scanner.nextInt();
        areaAndPerimeterOfRectangle(height, width);
        scanner.close();
    }
}
