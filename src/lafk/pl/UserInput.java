package lafk.pl;

import java.util.Scanner;

/**
 * Created by tammo on 20.02.16.
 */
public class UserInput {
    private final static Scanner s = new Scanner(System.in);
    public static int askWhichField() {
        return s.nextInt();
    }

    public static void closeScanner() {
        s.close();
    }
}
