import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String cord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String cord2 = scan.nextLine();

        int x1 = Integer.parseInt(cord1.substring(1, cord1.indexOf(",")));
        int y1 = Integer.parseInt(cord1.substring(cord1.indexOf(",") + 2, cord1.indexOf(")")));
        int x2 = Integer.parseInt(cord2.substring(1, cord2.indexOf(",")));
        int y2 = Integer.parseInt(cord2.substring(cord2.indexOf(",") + 2, cord2.indexOf(")")));

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println();
        System.out.println(equation.lineInfo());
        System.out.println();
        System.out.print("Enter a value for x: ");
        double testX = scan.nextDouble();
        System.out.println();
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));
    }
}
