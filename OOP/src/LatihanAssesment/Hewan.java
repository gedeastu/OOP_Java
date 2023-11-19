package LatihanAssesment;

abstract class Hewan {
    public abstract void bersuara();
}

class IdentityHewan{
    String nama;
    int usia;
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
