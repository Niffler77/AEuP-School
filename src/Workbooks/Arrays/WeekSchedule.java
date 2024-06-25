package Workbooks.Arrays;

public class WeekSchedule {
    public static void main(String[] args) {
        String[][] Schedule = {
                {
                        "#Tag#",
                        "Stunde 1",
                        "Stunde 2",
                        "Stunde 3",
                        "Stunde 4",
                        "Stunde 5",
                        "Stunde 6",
                        "Stunde 7"},
                {
                        "#Montag#",
                        "Deutsch",
                        "Deutsch",
                        "Mathe",
                        "Mathe",
                        "Englisch",
                        "------",
                        "------"},
                {
                        "#Dienstag#",
                        "Mathe",
                        "Mathe",
                        "Sozi",
                        "Physik",
                        "Deutsch",
                        "Sport",
                        "Sport"},
                {
                        "#Mittwoch#",
                        "Englisch",
                        "Englisch",
                        "Deutsch",
                        "Mathe",
                        "Mathe",
                        "------",
                        "------"},
                {
                        "#Donnerstag#",
                        "Erdkunde",
                        "Erdkunde",
                        "Mathe",
                        "Mathe",
                        "Musik",
                        "Kunst",
                        "Kunst"},
                {
                        "#Freitag#",
                        "Bio",
                        "Physik",
                        "Physik",
                        "Erdkunde",
                        "------",
                        "------",
                        "------"},
        };

        for (int i = 0; i < Schedule[0].length; i++) {
            for (int j = 0; j < Schedule.length; j++) {
                System.out.print(String.format("%-18.18s",Schedule[j][i]));
            }
            System.out.print("\t\n");
        }
    }
}
