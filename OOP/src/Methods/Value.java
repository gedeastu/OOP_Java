package Methods;
import java.util.Random;
// class Value {
//     public void PublicMethod(){
//         System.out.println("Hello, Public Methods");
//     }

//     public void damage(int percentDamage){
//         System.out.println("Percent Damage is " + percentDamage);
//     }
// }

class MemberLangganan{
    Random random = new Random();
    
    String Location = "Indonesia";
    String nama;
    int Id;

    MemberLangganan(String inputNama, int inputId, String Location){
        this.nama = inputNama;
        this.Id = inputId;
        this.Location = Location;
    }

    //Method without return and parameter
    void show(){
        System.out.println("Location : " + this.Location);
    }

    //Method without return but with parameter
    void changeName(String nama){
        System.out.println(this.nama = nama);
    }

    //Method with return but without parameter
    String getNama(){
        return this.nama;
    }

   //Method return and parameter
    String favoriteNumbe(int max, int min){
        int number = random.nextInt((max - min) + 1) + min;
        return "Angka kesukaan " + this.nama + " is " + number;
    }
}