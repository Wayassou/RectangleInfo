import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = getValidDouble(input, "Enter width: ");
        double height = getValidDouble(input, "Enter height: ");

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }

    private static double getValidDouble(Scanner input, String prompt) {
        double value = 0;
        boolean validInput;
        do {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
                validInput = false;
            }
        } while (!validInput);
        return value;
    }
}
