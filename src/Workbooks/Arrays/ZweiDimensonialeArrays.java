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


        boolean rowPrintout = false;
        while (!rowPrintout)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben sie die spalte an");
            int input = scanner.nextInt() ;
            int rowIndex = input - 1;

            if (rowIndex < indirket2D[rowIndex].length) {
                int rowsumm = 0;
                for (int i = 0; i < indirket2D[rowIndex].length; i++) {
                    rowsumm += indirket2D[rowIndex][i];
                }
                System.out.println("Summen der " + rowIndex +  " Zeile ist " +  rowsumm);
                rowPrintout = true;
            }
        }

        boolean columPrintOut = false;
        while (!columPrintOut)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Spalten-Index");
            int input = scanner.nextInt();
            int columIndex = input - 1;

            if (columIndex < indirket2D.length) {
                int columSumm = 0;
                for (int i = 0; i < indirket2D.length; i++) {
                    columSumm += indirket2D[i][columIndex ];
                }
                System.out.println("Summen der " + columIndex +  " Saplte ist " +  columSumm);
                columPrintOut = true;
            }
        }


    }
}
