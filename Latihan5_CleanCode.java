import java.util.regex.Pattern;

public abstract class Latihan5_CleanCode {
    class Responder {}

    // Copyright (C) 2011 by Osoco. All rights reserved.
    // Released under the terms of the GNU General Public License version 2 or later.

    // Returns an instance of the Responder being tested.
    protected abstract Responder responderInstance();

    public static void main(String[] args) {
        // format matched kk:mm:ss EEE, MMM dd, yyyy
        Pattern timeMatcher = Pattern.compile("\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*");

        Integer a = 1;
        Integer b = 2;

        System.out.println("Program berjalan sukses setelah refactoring!");
        System.out.println("Uji komparasi (a < b): " + (a.compareTo(b) == -1)); // a < b
        System.out.println("Uji komparasi (b > a): " + (b.compareTo(a) == 1));  // b > a
    }
}