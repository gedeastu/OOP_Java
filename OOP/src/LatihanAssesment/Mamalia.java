package LatihanAssesment;
import java.util.Scanner;
class Mamalia extends Hewan {
    Scanner scan = new Scanner(System.in);
    String jenisMamalia = scan.nextLine();
    String namaMamalia = scan.nextLine();
    @Override
    public void bersuara(){
        System.out.println("Nama Hewan : " + namaMamalia);
        System.out.println("Suara Mamalia : " + jenisMamalia);
    }
}
