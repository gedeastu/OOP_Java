package LatihanAssesment;
import java.util.Scanner;
public class Burung extends Hewan {

    Scanner scan = new Scanner(System.in);
    String jenisBurung = scan.nextLine();
    String namaBurung = scan.nextLine();

    @Override
    public void bersuara(){
        System.out.println("Nama Hewan : " + namaBurung);
        System.out.println("Suara Burung : " + jenisBurung);
    }
}
