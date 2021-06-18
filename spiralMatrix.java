public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        print_spiral_matrix(matrix);
    }

    public static void print_spiral_matrix(int[][] array) {
        
        // 4 Pointers Throw The Matrix
        int first_row = 0;
        int last_row = array.length - 1;
        int first_column = 0;
        int last_column = array[0].length - 1;

        // While Loop To Repeat The For Loops Throw The Matrix
        while (first_row < last_row && first_column < last_column) {
            
            // First Row
            for (int i = first_column; i <= last_column; i++)
                System.out.println(array[first_row][i]);

            // Last Column
            for (int i = first_row + 1; i <= last_row; i++)
                System.out.println(array[i][last_column]);

            // Last Row
            for (int i = last_column - 1; i >= first_column; i--)
                System.out.println(array[last_row][i]);

            // First Column
            for (int i = last_row - 1; i > first_column; i--)
                System.out.println(array[i][first_column]);
            
            // Updating Pointers
            first_row++;
            last_row--;
            first_column++;
            last_column--;
        }
    }
}
