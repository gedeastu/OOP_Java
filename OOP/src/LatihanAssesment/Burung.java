package LatihanAssesment;

public class Burung extends Hewan {
    String jenisBurung;
    
    @Override
    public void bersuara(){
        System.out.println("Suara Burung " + jenisBurung);
    }
}
