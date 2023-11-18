package Methods;

class Value {
    public void PublicMethod(){
        System.out.println("Hello, Public Methods");
    }

    public void damage(int percentDamage){
        System.out.println("Percent Damage is " + percentDamage);
    }
}

class MemberLangganan{
    String Location = "Indonesia";
    String nama;
    int Id;

    MemberLangganan(String inputNama, int inputId, String Location){
        this.nama = inputNama;
        this.Id = inputId;
        this.Location = Location;
    }
}
