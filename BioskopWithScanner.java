package Jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        boolean jalankanMenu = true;

        while (jalankanMenu) {

            System.out.println("Pilihan Menu: ");
            System.out.println("1: Input data penonton");
            System.out.println("2: Tampilkan daftar penonton");
            System.out.println("3: Exit");
            System.out.print("Masukkan menu: ");
            int pilihanMenu = scan21.nextInt();
            scan21.nextLine();
            switch (pilihanMenu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = scan21.nextLine();

                        System.out.print("Masukkan baris: ");
                        baris = scan21.nextInt();

                        System.out.print("Masukkan kolom: ");
                        kolom = scan21.nextInt();
                        scan21.nextLine();
                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.print("Input penonton lainnya? (y/n): ");
                                next = scan21.nextLine();

                                if (next.equalsIgnoreCase("n")) {
                                    break;
                                }
                            } else {
                                System.out.println("Kursi telah terisi oleh penonton lain \nsilahkan masukkan data kembali");
                            }
                        } else {
                            System.out.println("Kursi tidak tersedia");
                        }
                    }
                    break;

                case 2:

                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }

                    break;
                case 3:
                 System.out.println("Anda keluar dari menu");
                    break;

                default:
                    System.out.println("Input yang anda masukkan salah, masukkan kembali inputan dengan benar");
                    break;
            }

        }

    }
}
