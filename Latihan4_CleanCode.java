interface Point {
    double getX();
    double getY();
    void setCartesian(double x, double y);
    double getR();
    double getTheta();
    void setPolar(double r, double theta);
}

public class Latihan4_CleanCode implements Point {
    private double x, y;

    public double getX() { return x; }
    public double getY() { return y; }
    public void setCartesian(double x, double y) { this.x = x; this.y = y; }
    public double getR() { return 0.0; } 
    public double getTheta() { return 0.0; } 
    public void setPolar(double r, double theta) {} 

    public static void main(String[] args) {
        Point p = new Latihan4_CleanCode();
        p.setCartesian(10.5, 20.0);
        System.out.println("Program berjalan sukses setelah refactoring!");
        System.out.println("Titik koordinat X via abstraksi (getX): " + p.getX());
    }
}