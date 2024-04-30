package Workbooks.Arrays;

public class ZweiDimensonialeArrays {
    public static void main(String[] args) {
        int[][] dirket2d = {
                {10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23},
                {24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37},
                {38, 39, 40, 41, 42, 43, 44},
        };

        int[][] indirket = new int[5][7];

        int currentnumber = 10;
        for (int i = 0; i < indirket.length; i++) {
            for (int j = 0; j < indirket[i].length; j++) {
                indirket[i][j] = currentnumber;
                currentnumber++;
            }
        }

        System.out.println("Zeilenweiße: ");
        for (int i = 0; i < indirket.length; i++) {
            for (int j = 0; j < indirket[i].length; j++) {
                System.out.print(indirket[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("");
        System.out.println("Spaltenweißen: ");
        for (int i = 0; i < indirket[0].length; i++) {
            for (int j = 0; j < indirket.length; j++) {
                System.out.print(indirket[j][i] + " ");
            }
            System.out.print("\n");
        }

    }
}
