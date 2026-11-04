import java.util.Date;

public class Latihan2_CleanCode {
    private Date generationTimestamp = new Date();
    private Date modificationTimestamp = new Date();
    private final String recordId = "102";

    public static void main(String[] args) {
        Latihan2_CleanCode customer = new Latihan2_CleanCode();
        System.out.println("Program berjalan sukses setelah refactoring!");
        System.out.println("Customer Record ID: " + customer.recordId);
    }
}