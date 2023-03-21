import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList Hewan
        ArrayList<String> Hewan = new ArrayList<String>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan : \n" + Hewan);

        //ArrayList DeleteHewan
        ArrayList<String> DeleteHewan = new ArrayList<String>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        System.out.println("Hewan yang dihapus : \n" + DeleteHewan);

        // menghapus elemen-elemen dari Hewan yang sama dengan data warna dari DeleteHewan
        for (String warna : DeleteHewan) {
            while (Hewan.contains(warna)) {
                Hewan.remove(warna);
            }
        }

        // menampilkan ArrayList Hewan setelah penghapusan
        System.out.println("Output Hewan : \n" + Hewan);
    }
}