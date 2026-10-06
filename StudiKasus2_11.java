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
        System.out.print("Masukkan jumlah dokumen : ");
        jumlahDokumen = input.nextInt();
        System.out.print("Masukkan peringkat juara : ");
        peringkatJuara = input.nextInt();
    }
}
