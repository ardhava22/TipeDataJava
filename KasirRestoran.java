import java.util.Scanner;

public class KasirRestoran {
    public static void main(String[] args) {

        double total = 0, kembali, bayar;
        double Bakso, MieAyam, EsJeruk, EsTeh, AirPutih, JamurCrispy, TahuPetis;
        Bakso = 10000;
        MieAyam = 8000;
        EsJeruk = 4000;
        EsTeh = 3000;
        AirPutih = 2000;
        JamurCrispy = 6000;
        TahuPetis = 5000;

        // Pembukaan masuk restoran

        System.out.println("SELAMAT DATANG DI RESTORAN MEUWAHH (MEPET SAWAH)");
        System.out.println("----------------------------------");
        System.out.println("SILAHKAN PESAN MAKANAN DI KASIR");

        Scanner input = new Scanner(System.in);

        // Menu-menu yang ada di kasir

        do {
            System.out.println("-------------- MENU --------------");
            System.out.println("1. Bakso        : Rp 10.000");
            System.out.println("2. Mie Ayam     : Rp 8.000");
            System.out.println("3. Es Teh       : Rp 3.000");
            System.out.println("4. Es Jeruk     : Rp 4.000");
            System.out.println("5. Air Putih    : Rp 2.000");
            System.out.println("6. Jamur Crispy : Rp 6.000");
            System.out.println("7. Tahu Petis   : Rp 5.000 ");
            System.out.println("8. Selesai");

            System.out.println("Masukkan nomor menu yang anda ingin beli (1-8) : ");

            int Menu = input.nextInt();
            if (Menu == 8) {
                break;
            }

            double jumlah = 0;

        // Pilihan menu untuk pembeli

            switch (Menu) {
                case 1:
                    System.out.println("Masukkan jumlah bakso yang anda ingin beli : ");
                    jumlah = input.nextDouble();
                    if (jumlah < 0) {
                        System.out.println("Jumlah tidak valid. Harap masukkan jumlah yang valid.");
                        continue;
                    }
                    total += jumlah * Bakso;
                    break;
                case 2:
                    System.out.println("Masukkan jumlah mie ayam yang anda ingin beli : ");
                    jumlah = input.nextDouble();
                    if (jumlah < 0) {
                        System.out.println("Jumlah tidak valid. Harap masukkan jumlah yang valid.");
                        continue;
                    }
                    total += jumlah * MieAyam;
                    break;
                case 3:
                    System.out.println("Masukkan jumlah es teh yang anda ingin beli : ");
                    jumlah = input.nextDouble();
                    if (jumlah < 0) {
                        System.out.println("Jumlah tidak valid. Harap masukkan jumlah yang valid.");
                        continue;
                    }
                    total += jumlah * EsTeh;
                    break;
                case 4:
                    System.out.println("Masukkan jumlah es jeruk yang anda ingin beli : ");
                    jumlah = input.nextDouble();
                    if (jumlah < 0) {
                        System.out.println("Jumlah tidak valid. Harap masukkan jumlah yang valid.");
                        continue;
                    }
                    total += jumlah * EsJeruk;
                    break;
                case 5:
                    System.out.println("Masukkan jumlah air putih yang anda ingin beli : ");
                    jumlah = input.nextDouble();
                    if (jumlah < 0) {
                            System.out.println("Jumlah tidak valid. Harap masukkan jumlah yang valid.");
                            continue;
                    }
                    total += jumlah * AirPutih;
                    break;
                case 6:
                    System.out.println("Masukkan jumlah jamur crispy yang anda ingin beli : ");
                    jumlah = input.nextDouble();
                    if (jumlah < 0) {
                        System.out.println("Jumlah tidak valid. Harap masukkan jumlah yang valid.");
                        continue;
                    }
                    total += jumlah * JamurCrispy;
                    break;
                case 7:
                    System.out.println("Masukkan jumlah tahu petis yang anda ingin beli : ");
                    jumlah = input.nextDouble();
                    if (jumlah < 0) {
                        System.out.println("Jumlah tidak valid. Harap masukkan jumlah yang valid.");
                        continue;
                    }
                    total += jumlah * TahuPetis;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih nomor menu yang valid.");
            }
        } while (true);

        // Tagihan bayaran untuk pembeli

        System.out.println("Total bayar : " + total);

        do {
            System.out.println("Masukkan pembayaran : ");
            double Bayar = input.nextDouble();
            double Kembali = Bayar - total;

        // Pembayaran makanan dan minuman pembeli

            if (Kembali == 0) {
                System.out.println("Pembayaran pas. Terima kasih!!");
                break;
            } else if (Kembali < 0) {
                System.out.println("Maaf pembayaran kurang. Uang Anda kurang sebesar " + (-Kembali));
            } else {
                System.out.println("Total kembali : " + Kembali);
                break;
            }
        } while (true);
    }
}

// Selesai