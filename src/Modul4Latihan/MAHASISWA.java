package Modul4Latihan;
import java.util.HashMap;
import java.util.Scanner;
public class MAHASISWA {
        String nama,kelas,matkulPraktikum ;
        int nim;

        public MAHASISWA(String nm, String kl,String mat, int ni){
            nama = nm;
            kelas=kl;
            matkulPraktikum= mat;
            nim = ni;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            HashMap<String,MAHASISWA> mhs = new HashMap<>();
            String input;
            MAHASISWA data ;

            mhs.put("1",new MAHASISWA("Putri","3H","Struktur Data",2020000));
            mhs.put("2",new MAHASISWA("Agus","3A","Matematika",2020012));
            mhs.put("3",new MAHASISWA("Arro","3D","Pemrograman",2020017));

            System.out.println("Masukan ID: ");
            input=in.nextLine();
            data= mhs.get(input);
            if (data != null){
                System.out.println("Data Mahasiswa : "+ data.nama + ", Kelas"+data.kelas+
                        ", Mata Kuliah : "+data.matkulPraktikum + ", Nim : "+data.nim);
            }

        }
}

