package LatihanAssesment;
import java.util.Scanner;
public class Burung extends Hewan {

    Scanner scan = new Scanner(System.in);
    String jenisBurung = scan.nextLine();
    String namaBurung = scan.nextLine();
    String suaraBurung = scan.nextLine();
    @Override
    public void bersuara(){
        System.out.println("Nama Hewan : " + namaBurung);
        System.out.println("Jenis Burung : " + jenisBurung);
        System.out.println("Suara Burung : " + suaraBurung);
        System.out.println("\n");
    }
}
