package LatihanAssesment;
import java.util.Scanner;



class Mamalia extends Hewan {
    Scanner scan = new Scanner(System.in);
    String jenisMamalia = scan.nextLine();
    String namaMamalia = scan.nextLine();
    String suaraMamalia;
    @Override
    public void bersuara(){
        if(jenisMamalia == "Harimau"){
            suaraMamalia = "ROARR";
        }else{
            suaraMamalia = "UWOGHHH SEGSS";
        }
        System.out.println("Nama Hewan : " + namaMamalia);
        System.out.println("Jenis Mamalia : " + jenisMamalia);
        System.out.println("Suara Mamalia : " + suaraMamalia);
        System.out.println("\n");
    }
}
