public class Constructors {
    int modelYear;
    String modelName;

    public Constructors(int year, String name){
        modelName = name;
        modelYear = year;
    }


    public static void main(String[] args) {
        Constructors Obj = new Constructors(2023,"Samsung S23");
        System.out.println(Obj.modelYear + " " + Obj.modelName);
    }
}
