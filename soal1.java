import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        try (Scanner Baca = new Scanner(System.in)) {
            float p, l, luas;//desklarasi variabel 
            
            System.out.print("Masukkan panjang  : ");
            p=Baca.nextFloat();

            System.out.print("Masukkan lebar : ");
            l=Baca.nextFloat();

            luas=p*l;

            System.out.print("Luas adalah : "+luas);

            String A,B;
            System.out.print("Masukkan Teks A : ");
            A=Baca.next();
            System.out.print("Masukkan Teks B : ");
            B=Baca.next();

            System.out.print("Teks Setelah Disambung : " );
            System.out.print(A+" "+B);
        }
    }
}