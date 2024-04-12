package WeitereUebungen.Extra;

import java.util.Scanner;

public class Bildgröße {

    public static void Bildgröße() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input lenght");
        long length = scanner.nextLong();

        System.out.println("Please input with");
        long with = scanner.nextLong();

        long filesize = (length * with) * 24 + 432;

        long filesizebyte = filesize / 8;
        long filesizekibibyte = filesizebyte / 1024;
        long filesizemebibyte = filesizekibibyte / 1024;

        System.out.println(filesize + " Bit");
        System.out.println(filesizebyte + " Byte");
        System.out.println(filesizekibibyte + " kiB");
        System.out.println(filesizemebibyte + " miB");
    }
}
