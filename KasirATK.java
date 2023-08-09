import java.util.Scanner;

public class KasirATK {
    public static void main(String[] args) {
        double bukuTulis, pensil, penghapus, penggaris;
        bukuTulis=2500;
        pensil=1000;
        penghapus=1500;
        penggaris=1000;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah beli buku tulis:");
        double jumlahBuku = input.nextDouble();
        double total = jumlahBuku*bukuTulis;
        System.out.println("Masukan jumlah pensil:");
        double jumlahPensil = input.nextDouble();
        total += jumlahPensil*pensil;
        System.out.println("Masukan jumlah beli penghapus:");
        double jumlahpenghapus = input.nextDouble();
        total += jumlahpenghapus*penghapus;
        System.out.println("Masukan jumlah beli penggaris:");
        double jumlahpenggaris = input.nextDouble();
        total += jumlahpenggaris*penggaris;


        System.out.println("masukan Pembayaran");
        double bayar = input.nextDouble();
        double diskon = 0.05*total;
        double kembali = bayar-(total-diskon);
        System.out.println("total diskon:"+diskon);
        System.out.println("total kembalian"+kembali);

    }
}
