package Contructors;
public class Constructors {

   Value obj = new Value();
   String ModelName = obj.modelName;
   int ModelYear = obj.modelYear;
   String Speksifikasi = obj.Speksifikasi;

    Constructors(int year, String name, String speksifikasi){
        ModelName = name;
        ModelYear = year;
        Speksifikasi = speksifikasi;
    }

    public static void main(String[] args) {

        Constructors value01 = new Constructors(2023,"Samsung S23", "Snapdragon gen 1");
        System.out.println(value01.ModelYear + " " + value01.ModelName + " " + value01.Speksifikasi);


        Constructors value02 = new Constructors(2021, "Iphone 12 pro max", "Bionic 13");
        System.out.println(value02.ModelName + " " + value02.ModelYear + " " + value02.Speksifikasi);
    }
}
