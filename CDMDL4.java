
package cdmodl4;
import java.util.HashMap;
import java.util.Scanner;

public class CDMODL4 {

  public static void main (String[] args) {
        HashMap<String, Integer> inventori = new HashMap<>();

        inventori.put("Pensil", 50);
        inventori.put("Buku", 35);
        inventori.put("Penghapus", 25);

        System.out.println("Inventori awal: " + inventori);

        inventori.put("Pensil", inventori.get("Pensil") + 29);
        inventori.remove("Penghapus");
        System.out.println("Inventori setelah update:" + inventori);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama barang yang ingin dicari: ");
        String barang = scanner.nextLine();

        cariBarang(inventori, barang);
    }

    public static void cariBarang(HashMap<String, Integer> inventori, String barang) {
        if (inventori.containsKey(barang)) {
            System.out.println("Stok" + barang + ": " + inventori.get(barang) + "Unit.");
        } else {
            System.out.println("Barang" + barang + "tidak tersedia di inventori.");
        }
    }       
}

#   C D M O D U L 4  
 #   C O D E M D L 4  
 