package Workbooks.Arrays;

import java.util.Scanner;

public class ZweiDimensonialeArrays {
    public static void main(String[] args) {
        int[][] dirket2D = {
                {10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23},
                {24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37},
                {38, 39, 40, 41, 42, 43, 44},
        };

        int[][] indirket2D = new int[5][7];

        int currentnumber = 10;
        for (int i = 0; i < indirket2D.length; i++) {
            for (int j = 0; j < indirket2D[i].length; j++) {
                indirket2D[i][j] = currentnumber;
                currentnumber++;
            }
        }

        System.out.println("Zeilenweiße: ");
        for (int i = 0; i < indirket2D.length; i++) {
            for (int j = 0; j < indirket2D[i].length; j++) {
                System.out.print(indirket2D[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("");
        System.out.println("Spaltenweißen: ");
        for (int i = 0; i < indirket2D[0].length; i++) {
            for (int j = 0; j < indirket2D.length; j++) {
                System.out.print(indirket2D[j][i] + " ");
            }
            System.out.print("\n");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Zeilen-Index");
        int rowindex = scanner.nextInt() ;
        int rowsumm = 0;
        for (int i = 0; i < indirket2D[rowindex - 1].length; i++) {
            rowsumm += indirket2D[rowindex - 1 ][i];
        }

        System.out.println("Summen der " + rowindex +  " Zeile ist " +  rowsumm);

        System.out.println("Input Spalten-Index");
        int columindex = scanner.nextInt();
        int columsumm = 0;
        for (int i = 0; i < indirket2D.length; i++) {
            columsumm += indirket2D[i][columindex - 1];
        }
        System.out.println("Summen der " + columindex +  " Saplte ist " +  columsumm);

    }
}
