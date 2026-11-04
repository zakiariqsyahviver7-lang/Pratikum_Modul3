import java.util.List;
import java.util.ArrayList;

public class Latihan1_BadCode {
    // Variabel tiruan agar tidak error "cannot find symbol"
    private static List<int[]> theList = new ArrayList<>();

    // Kode asli dari buku (Code Smell)
    public static List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    public static void main(String[] args) {
        // Data tiruan
        theList.add(new int[]{4, 1, 2}); 
        theList.add(new int[]{0, 5, 1});

        System.out.println("Menjalankan program Bad Code...");
        System.out.println("Jumlah sel yang diambil: " + getThem().size());
    }
}