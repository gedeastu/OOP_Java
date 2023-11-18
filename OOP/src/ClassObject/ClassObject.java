package ClassObject;
public class ClassObject {
    public static void main(String[] args) throws Exception {
        Value Obj = new Value();
        Obj.name = "Gede Astu Nugraha";
        Obj.age = 19;
        Obj.Jurusan = "Rekayasa Perangkat Lunak Aplikasi";
        System.out.println("My name is " + Obj.name  + " in age " + Obj.age + " with major " + Obj.Jurusan);

        Value Obj2 = new Value();
        Obj2.name = "Ni luh Nyoman sri Puspitayani";
        Obj2.age = 19;
        Obj2.Jurusan = "Digital Public Relation";
        System.out.println("My name is " + Obj2.name  + " in age " + Obj2.age + " with major " + Obj2.Jurusan);
    }
}
