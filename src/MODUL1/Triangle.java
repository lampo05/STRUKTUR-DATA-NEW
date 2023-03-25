package MODUL1;

import java.util.Scanner;

public class Triangle<T extends Number> {
    private T alasTriangle;
    private T tinggiTriangle;

    public Triangle(T alas, T tinggi) {
        this.alasTriangle = alas;
        this.tinggiTriangle = tinggi;
    }

    public int getResultInt() {
        return (int) (0.5 * alasTriangle.intValue() * tinggiTriangle.intValue());
    }

    public double getResultDouble() {
        return  0.5 * alasTriangle.doubleValue() * tinggiTriangle.doubleValue();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Mau menampilkan hasil luas dalam bentuk? : ");
            System.out.println("1. Hasil to Integer");
            System.out.println("2. Hasil to Double");
            System.out.print("Masukkan pilihan 1 / 2 : ");
            int Pilih = in.nextInt();
            System.out.println();

            Number alas;
            Number tinggi;
            if (Pilih == 1) {

                System.out.print("Masukkan nilai alas    : ");
                alas = in.nextInt();
                System.out.print("Masukkan nilai tinggi  : ");
                tinggi = in.nextInt();
                Triangle<Integer> luasTipeInt = new Triangle<>((Integer) alas, (Integer) tinggi);
                System.out.println("Luas Segitiga dalam Integer: " + luasTipeInt.getResultInt());

            } else if (Pilih == 2) {

                System.out.print("Masukkan nilai alas    : ");
                alas = in.nextDouble();
                System.out.print("Masukkan nilai tinggi  : ");
                tinggi = in.nextDouble();
                Triangle<Double> luasTipeDouble = new Triangle<>((Double) alas, (Double) tinggi);
                System.out.println("Luas Segitiga dalam Double : " + luasTipeDouble.getResultDouble());
            } else {
                System.out.println("Pilihan tidak Ada . Pilih Kembali.");
            }

            System.out.println();
            System.out.print("Apakah Anda ingin melanjutkan program? (y/n) ");
            String jawaban = in.next();
            if (jawaban.equalsIgnoreCase("n")) {
                lanjut = false;
                System.out.println("Exit Detect.");
            }
        }
    }
}


