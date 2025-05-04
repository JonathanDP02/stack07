import java.util.Scanner;

public class suratDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackSurat07 stack = new stackSurat07(5);
        int pilih;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.print("ID Surat         : ");
                        String idSurat = sc.nextLine();
                        System.out.print("Nama Mahasiswa   : ");
                        String namaMhs = sc.nextLine();
                        System.out.print("Kelas            : ");
                        String kelas = sc.nextLine();
                        System.out.print("Jenis Izin (S/I) : ");
                        char jenisIzin = sc.next().charAt(0);
                        System.out.print("Durasi           : ");
                        int durasi = sc.nextInt();
                        sc.nextLine();

                        surat07 mhs = new surat07(idSurat, namaMhs, kelas, jenisIzin, durasi);
                        stack.push(mhs);
                        System.out.println("Surat sudah dimasukkan");
                        break;

                    case 2: 
                        surat07 diproses = stack.pop();
                        if (diproses != null) {
                            System.out.println("Memproses surat berikut");
                            diproses.tampil();
                        }
                        break;

                    case 3:
                        surat07 terakhir = stack.peek();
                        if (terakhir != null) {
                            System.out.println("Surat izin terakhir: ");
                            terakhir.tampil();
                        }else{
                            System.out.println("Belum adaa surat");
                        }
                        break;

                    case 4:
                        System.out.print("Masukkan nama mahasiswa yang dicari: ");
                        String cari = sc.nextLine();
                        boolean ditemukan = stack.cariSurat(cari);

                        if (ditemukan) {
                            System.out.println("Surat atas nama " + cari + " ditemukan.");
                        } else {
                            System.out.println("Tidak ditemukan surat atas nama tersebut.");
                        }
                        break;

                    case 5:
                        System.out.println("Program selesai.");
                        break;
                
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
        }while (pilih != 5);

    }
}
