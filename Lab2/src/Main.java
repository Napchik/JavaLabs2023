import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static char[][] fillMatrix(int columns, int rows){
        char[][] name = new char[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                name[row][column] = (char) ((Math.random() * (126 - 48)) + 48);
            }
        }
        return name;
    }
    public static void printMatrix(char[][] Matrix, int rows, int columns){
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(Matrix[row][column]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static int valuein(String name1, String name2){
        int value = 0;
        Scanner getFromConsole = new Scanner(System.in);
        while (true) {
            try {
                getFromConsole.reset();
                System.out.println("Введіть кількість " + name1 + " (Матриці " + name2 + "): ");
                value = getFromConsole.nextInt();
                if (value >= 0) {
                    break;
                }
                throw new InputMismatchException("test");

            } catch (InputMismatchException e) {
                System.out.println("Помилка вводу");
                getFromConsole.next();
            }
        }

        return value;
    }


    public static void main(String[] args) {
        // Вхідні дані: №1328
        // C5 = 1328 % 5; // 3 - "C=A⊕B"
        // C7 = 1328 % 7; // 5 - "char"
        // C11 = 1328 % 11; // 8 - "Знайти середнє значення елементів кожного рядка матриці"

        int rows_A = 0, columns_A =0, rows_B =0, columns_B=0;

        rows_A = valuein("строк", "A");
        columns_A = valuein("столбців", "A");
        rows_B = valuein("строк", "B");
        columns_B = valuein("столбців", "B");

        int rows_C = rows_A + rows_B;
        int columns_C = columns_A + columns_B;
        char[][] matrix_A;
        char[][] matrix_B;
        char[][] matrix_C = new char[rows_C][columns_C];
        char[][] massive_sr = new char[rows_C][1];

        System.out.println("Матриця A: ");
        matrix_A = fillMatrix(columns_A, rows_A);
        printMatrix(matrix_A, rows_A, columns_A);

        System.out.println("Матриця B: ");
        matrix_B = fillMatrix(columns_B,rows_B);
        printMatrix(matrix_B, rows_B, columns_B);

        for (int row = 0; row < rows_C; row++) {
            for (int column = 0; column < columns_C; column++) {
                if (row < rows_A && column < columns_A) {
                    matrix_C[row][column] = matrix_A[row][column];
                } else if (row >= rows_A && column >= columns_A) {
                    matrix_C[row][column] = matrix_B[row - rows_A][column - columns_A];
                }
            }
        }

        System.out.println("Матриця C: ");
        printMatrix(matrix_C, rows_C, columns_C);


        System.out.print("Середнє арифметичне рядків 1 - "+ rows_C + "\n");
        for (int row = 0; row < rows_C; row++) {
            int sum = 0;
            for (int column = 0; column < columns_C; column++) {
                sum += matrix_C[row][column];
            }
            int sum_avr = sum / columns_C;
            massive_sr[row][0] = (char) sum_avr;
        }
        printMatrix(massive_sr, rows_C, 1);
    }
}