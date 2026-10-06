import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int hargaPerCup = 18000;
    int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

    System.out.print("Masukkan berapa cup yang ingin dibeli : ");
    jumlahCup = input.nextInt();
    System.out.print("Masukkan uang pembayaran : ");
    uangBayar = input.nextInt();

    totalHarga = jumlahCup * hargaPerCup;
    diskon = 0;

    if (totalHarga >= 100000) {
        diskon = totalHarga * 10 / 100;
    }

    totalBayar = totalHarga - diskon;

    System.out.println("Total harga : " + totalHarga);
    System.out.println("Diskon yang didapatkan : " + diskon);
    System.out.println("Total Bayar yang harus dibayarkan : " + totalBayar);

    if (uangBayar >= totalBayar) {
        kembalian = uangBayar - totalBayar;

        System.out.println("Anda mendapatkan kembalian : " + kembalian);
    } else {
        kurang = totalBayar - uangBayar;

        System.out.println("Uang anda kurang : " + kurang);
    }
}