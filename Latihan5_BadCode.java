public class Latihan5_BadCode {
    /**
     * Changes (from 11-Oct-2001)
     * 11-Oct-2001 : Re-organised the class ...
     * 05-Nov-2001 : Added a getDescription() method ...
     */

    /** The day of the month. */ 
    private int dayOfMonth = 15;

    /**
     * Returns the day of the month.
     * @return the day of the month
     */
    public int getDayOfMonth() { return dayOfMonth; }

    public static void main(String[] args) {
        Latihan5_BadCode date = new Latihan5_BadCode();
        System.out.println("Menyiapkan Bad Code...");
        System.out.println("Tanggal (Bad Code): " + date.getDayOfMonth());
    }
}