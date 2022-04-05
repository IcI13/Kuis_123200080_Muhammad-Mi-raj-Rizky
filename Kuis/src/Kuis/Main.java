/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

import java.util.Scanner;

/**
 *
 * @author D15kY
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String tim;
        String nama;
        String sekolahA;
        String sekolahS;
        int pilih,pilih1;
        int pengulangan =1;
        double kreativ,al,sinema,k,is,ss,pkb;
        
        System.out.println("LOMBA ANIMASI DAN SURAT UPNVYK");
        System.out.println("1. Animasi (tim)");
        System.out.println("2. Menulis Surat(individu)");
        System.out.printf("Pilih Kategori Perlombaan : ");
        pilih = input.nextInt();
        switch(pilih){
            case 1 : 
                System.out.println("===FORM PENDAFTARAN===");
                System.out.printf("input Nama Tim :\t");
                tim = input.nextLine();
                System.out.printf("Asal Sekolah :\t");
                sekolahA = input.nextLine();
                System.out.println("\n===FORM PENILAIAN===");
                System.out.println("keteranagan: Nilai yang valid berada di antara 0 - 100");
                System.out.printf("\nInput Nilai alur cerita :\t");
                al = input.nextDouble();
                System.out.printf("\nInput Nilai konten :\t");
                k = input.nextDouble();
                System.out.printf("\nInput Nilai kreativitas :\t");
                kreativ = input.nextDouble();
                System.out.printf("\nInput Nilai sinematografi :\t");
                sinema = input.nextDouble();
                PesertaLomba peserta = new PesertaLomba(al,k,kreativ,sinema);
                while(pengulangan !=0){
                System.out.println("===Menu===");
                System.out.println("1. Tampil"
                        + "\n2. Edit"
                        + "\n3. Exit");
                System.out.printf("Pilih : ");
                pilih1 = input.nextInt();
                switch(pilih1){
                    case 1 :
                        if(peserta.hasil<85){
                        System.out.println("Nilai Akhir"+peserta.hasil);
                            System.out.println("Keterangan : Gagal");
                            System.out.println("Mohon Maaf, Tim "+tim+" dari "+sekolahA+" tidak lolos seleksi lomba animasi");
                            
                        }
                        else{
                            System.out.println("Nilai Akhir : "+peserta.hasil);
                            System.out.println("Keterangan : Lolos");
                            System.out.println("Selamat, Tim "+tim+" dari "+sekolahA+" lolosseleksi lomba animasi");
                        }
                        break;
                    case 2 : 
                        System.out.println("===Edit Nilai===");
                        System.out.printf("\nInput Nilai alur cerita :\t");
                        al = input.nextDouble();
                        System.out.printf("\nInput Nilai konten :\t");
                        k = input.nextDouble();
                        System.out.printf("\nInput Nilai kreativitas :\t");
                        kreativ = input.nextDouble();
                        System.out.printf("\nInput Nilai sinematografi :\t");
                        sinema = input.nextDouble();
                        break;
                    case 3 :
                        System.out.println("Terima Kasih");
                        pengulangan=0;
                        break;
                }
        }
                break;
            case 2 :
                System.out.println("===FORM PENDAFTARAN===");
                System.out.printf("input Nama Tim :\t");
                nama = input.nextLine();
                System.out.printf("Asal Sekolah :\t");
                sekolahS = input.nextLine();
                System.out.println("\n===FORM PENILAIAN===");
                System.out.println("keteranagan: Nilai yang valid berada di antara 0 - 100");
                System.out.printf("\nInput Nilai struktur surat :\t");
                ss = input.nextDouble();
                System.out.printf("\nInput Nilai isi surat :\t");
                is = input.nextDouble();
                System.out.printf("\nInput Nilai kreativitas :\t");
                kreativ = input.nextDouble();
                System.out.printf("\nInput Nilai penerapan Kaidah Bahasa :\t");
                pkb = input.nextDouble();
                PesertaLombaS pesertas = new PesertaLombaS(ss,is,kreativ,pkb);
                while(pengulangan !=0){
                System.out.println("===Menu===");
                System.out.println("1. Tampil"
                        + "\n2. Edit"
                        + "\n3. Exit");
                System.out.printf("Pilih : ");
                pilih1 = input.nextInt();
                switch(pilih1){
                    case 1 :
                        if(pesertas.hasil1<85){
                        System.out.println("Nilai Akhir"+pesertas.hasil1);
                            System.out.println("Keterangan : Gagal");
                            System.out.println("Mohon Maaf, "+nama+" dari "+sekolahS+" tidak lolos seleksi lomba animasi");
                            
                        }
                        else{
                            System.out.println("Nilai Akhir : "+pesertas.hasil1);
                            System.out.println("Keterangan : Lolos");
                            System.out.println("Selamat,"+nama+" dari "+sekolahS+" lolosseleksi lomba animasi");
                        }
                        break;
                    case 2 : 
                        System.out.println("===Edit Nilai===");
                        System.out.printf("\nInput Nilai struktur surat :\t");
                        ss = input.nextDouble();
                        System.out.printf("\nInput Nilai isi surat :\t");
                        is = input.nextDouble();
                        System.out.printf("\nInput Nilai kreativitas :\t");
                        kreativ = input.nextDouble();
                        System.out.printf("\nInput Nilai Penerapan Kaidah Bahasa :\t");
                        pkb = input.nextDouble();
                        break;
                    case 3 :
                        System.out.println("Terima Kasih");
                        pengulangan=0;
                }
        }
        }
    }
    
}
