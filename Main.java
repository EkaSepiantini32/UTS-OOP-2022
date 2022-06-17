package pkg20103295_utsoop;

import java.util.Scanner;

/**
 *
 * @author 20103295 Ni Putu Eka Sepiantini
 */
public class Main {

    public static void main(String[] args) {
        String nama;
        int pilihan = 0;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("~~~~~Daftar Pengunjung Kebun Binatang~~~~~");
        System.out.println("\n 1. Tampilkan Pengunjung \n 2. Isi Data Pengunjung \n 3. Keluar");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Pilihan Menu : ");
        
        switch(pilihan){
            
            case 1:
                System.out.print("Tampilkan Pengunjung"
                     + "\n1. nama"
                     + "\n:");
                
                pilihan = scan.nextInt();
                
                if (pilihan == 1 ){
                    System.out.println("Daftar Pengunjung Kebuun Binatang");
                } else
                    System.out.println("Belum Ada Data Pengunjung");
                
                break;
                
            case 2 :
                 System.out.print("Isi Data Pengunjung"
                        
                        + "\n1. Isi"
                        + "\n:");
                 pilihan = scan.nextInt();
                 
                 if (pilihan == 1){
                     System.out.println("Nama Pengunjung : ");
                 } else
                break;
            
            case 3 :
                 System.exit(0);
                break;
            
               
            default : System.out.println("Opsi Pilihan Tidak Terdaftar");
        
        }     
    }
}
