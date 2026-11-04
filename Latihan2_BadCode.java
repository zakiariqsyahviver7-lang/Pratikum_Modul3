import java.util.Date;

public class Latihan2_BadCode {
    private Date genymdhms = new Date();
    private Date modymdhms = new Date();
    private final String pszqint = "102";

    public static void main(String[] args) {
        Latihan2_BadCode record = new Latihan2_BadCode();
        System.out.println("Menyiapkan Bad Code...");
        System.out.println("Record ID: " + record.pszqint);
    }
}