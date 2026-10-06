import java.util.Scanner;

public class StudiKasus2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan;

        System.out.print("Masukkan nama mahasiswa : ");
        namaMahasiswa = input.next();
        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        jenisKegiatan = input.next();

        switch (jenisKegiatan.toUpperCase()) {
            case "BELMAWA", "BAKORMA", "Mandiri":
                System.out.print("Masukkan jumlah dokumen : ");
                jumlahDokumen = input.nextInt();
                System.out.print("Masukkan peringkat juara : ");
                peringkatJuara = input.nextInt();

                if (jumlahDokumen == 4) {
                    if (peringkatJuara > 0 && peringkatJuara <= 3) {
                        System.out.println("Status : Semua syarat terpenuhi. Dana penghargaan diberikan");
                    } else {
                        System.out.println("Status : Anda tidak mendapatkan juara / harapan. Dana penghargaan tidak diberikan");
                    }
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang dari " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan");
                }
                break;

            case "PKM" :
                System.out.print("Masukkan jumlah dokumen : ");
                jumlahDokumen = input.nextInt();
                System.out.print("Masukkan status pendanaan PKM : ");
                statusPendanaan = input.nextInt();

                if (jumlahDokumen == 4) {
                    if (statusPendanaan == 1) {
                        System.out.println("Status : Semua syarat terpenuhi. Dana pendanaan diberikan");
                    } else {
                        System.out.println("Status : Status pendanaan anda tidak lolos. Dana penghargaan tidak diberikan");
                    }
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang dari " + (4 - jumlahDokumen) + " dokumen). Dana pendanaan tidak diberikan");
                }
                break;
                
            default:
                System.out.println("Status : Lomba yang anda ikuti berada di luat kegiatan kampus. Dana tidak diberikan");
                break;
        }
    }
}
