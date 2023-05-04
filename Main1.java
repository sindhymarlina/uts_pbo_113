//nomor 1

// Kelas Mobil
class Mobil {
    private String merek;
    private boolean menyala;
    private int kecepatan;

    public Mobil(String merek) {
        this.merek = merek;
        this.menyala = false;
        this.kecepatan = 0;
    }

    public void hidupkan() {
        this.menyala = true;
        System.out.println("Mobil dinyalakan.");
    }

    public void matikan() {
        this.menyala = false;
        this.kecepatan = 0;
        System.out.println("Mobil dimatikan.");
    }

    public void tambahKecepatan() {
        if (this.menyala) {
            this.kecepatan += 10;
            System.out.println("Kecepatan bertambah. Kecepatan saat ini: " + this.kecepatan + " km/jam.");
        } else {
            System.out.println("Nyalakan mobil terlebih dahulu.");
        }
    }

    public void kurangiKecepatan() {
        if (this.menyala) {
            if (this.kecepatan > 0) {
                this.kecepatan -= 10;
                System.out.println("Kecepatan berkurang. Kecepatan saat ini: " + this.kecepatan + " km/jam.");
            } else {
                System.out.println("Mobil sudah berhenti.");
            }
        } else {
            System.out.println("Nyalakan mobil terlebih dahulu.");
        }
    }

    public void printStatus() {
        System.out.println("Merek: " + this.merek);
        System.out.println("Status: " + (this.menyala ? "Menyala" : "Mati"));
        System.out.println("Kecepatan: " + this.kecepatan + " km/jam");
    }
}

// Kelas Main1 (untuk simulasi)
public class Main1 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");

        mobil.printStatus(); // Cek status awal mobil (mati, kecepatan 0)

        mobil.hidupkan(); // Nyalakan mobil

        mobil.tambahKecepatan(); // Tambah kecepatan (kecepatan saat ini: 10 km/jam)
        mobil.tambahKecepatan(); // Tambah kecepatan (kecepatan saat ini: 20 km/jam)

        mobil.kurangiKecepatan(); // Kurangi kecepatan (kecepatan saat ini: 10 km/jam)

        mobil.matikan(); // Matikan mobil

        mobil.tambahKecepatan(); // Mobil mati, kecepatan tidak bisa bertambah

        mobil.printStatus(); // Cek status akhir mobil
    }
}
