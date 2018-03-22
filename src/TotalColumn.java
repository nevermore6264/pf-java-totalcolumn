import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        double array[][] = new double[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("Array[" + row + "][" + column + "] = ");
                array[row][column] = scanner.nextDouble();
            }
        }
        System.out.println("Enter number column :");
        int number = scanner.nextInt();

        double total = 0;
        for (int row = 0; row < array.length; row++) {
            total += array[row][number];
        }
        System.out.println("Total of column: " + total);
    }
}
