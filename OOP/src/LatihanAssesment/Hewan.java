package LatihanAssesment;

abstract class Hewan {
    private String nama;
    private int usia;

    public abstract void bersuara();

    //getNama and setNama
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }


    //getUsia and setUsia
    public int getUsia(){
        return usia;
    }
    public void setUsia(int usia){
        this.usia = usia;
    }
}
