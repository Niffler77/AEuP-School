package OtherThings.Arrays;

import java.util.Arrays;

public class OtherArrayThing {
    public static void main(String[] args) {

        class Student {
            String firstName;
            String lastName;
            int[] codes;

            Student(String firstName, String lastName, int[] codes) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.codes = codes;
            }

            @Override
            public String toString() {
                return firstName + " " + lastName + " " + Arrays.toString(codes);
            }
        }

        Student[] students = new Student[20];

        // 20 Studenten erstellen
        students[0] = new Student("Benjamin", "Müller", new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
        students[1] = new Student("Max", "Mustermann", new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
        students[2] = new Student("Hans", "Peter", new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3});
        students[3] = new Student("Peter", "Hans", new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4});
        students[4] = new Student("Müller", "Benjamin", new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5});
        students[5] = new Student("Mustermann", "Max", new int[]{6, 6, 6, 6, 6, 6, 6, 6, 6, 6});
        students[6] = new Student("Peter", "Hans", new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7, 7});
        students[7] = new Student("Hans", "Peter", new int[]{8, 8, 8, 8, 8, 8, 8, 8, 8, 8});
        students[8] = new Student("Benjamin", "Müller", new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9});
        students[9] = new Student("Max", "Mustermann", new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
        students[10] = new Student("Hans", "Peter", new int[]{11, 11, 11, 11, 11, 11, 11, 11, 11, 11});
        students[11] = new Student("Peter", "Hans", new int[]{12, 12, 12, 12, 12, 12, 12, 12, 12, 12});
        students[12] = new Student("Müller", "Benjamin", new int[]{13, 13, 13, 13, 13, 13, 13, 13, 13, 13});
        students[13] = new Student("Mustermann", "Max", new int[]{14, 14, 14, 14, 14, 14, 14, 14, 14, 14});
        students[14] = new Student("Peter", "Hans", new int[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15});
        students[15] = new Student("Hans", "Peter", new int[]{16, 16, 16, 16, 16, 16, 16, 16, 16, 16});
        students[16] = new Student("Benjamin", "Müller", new int[]{17, 17, 17, 17, 17, 17, 17, 17, 17, 17});
        students[17] = new Student("Max", "Mustermann", new int[]{18, 18, 18, 18, 18, 18, 18, 18, 18, 18});
        students[18] = new Student("Hans", "Peter", new int[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19});
        students[19] = new Student("Peter", "Hans", new int[]{20, 20, 20, 20, 20, 20, 20, 20, 20, 20});



        //ausgabe alle Studententen
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }}