public class ArrayNumbers {

    public static void main(String[] args) {

        // Create a 2D array with 3 rows (each row defined separately)
        double[][] tab = new double[3][];

        // Define values for each row
        double[] line0 = {1.0, 1.5, 2.0};
        double[] line1 = {1.5, 2.0, 2.5};
        double[] line2 = {2.0, 2.5, 3.0};

        // Assign rows to the main array
        tab[0] = line0;
        tab[1] = line1;
        tab[2] = line2;

        // Calculate the sum of the products of both diagonals
        double result = (tab[0][0] * tab[1][1] * tab[2][2]) + (tab[0][2] * tab[1][1] * tab[2][0]);
        System.out.println("Sum of the products of main and anti-diagonals: " + result);

        // Calculate the product of the sums of the middle row and middle column
        result = (tab[0][1] + tab[1][1] + tab[2][1]) * (tab[1][0] + tab[1][1] + tab[1][2]);
        System.out.println("Product of the sums of the middle row and middle column: " + result);

        // Calculate the sum of all edge elements (excluding the center)
        result = tab[0][0] + tab[0][1] + tab[0][2]     // first row
               + tab[1][0] + tab[1][2]                // middle row (edges only)
               + tab[2][0] + tab[2][1] + tab[2][2];   // last row
        System.out.println("Sum of all elements located on the edge of the array: " + result);
    }
}