package Methods;
public class Methods {

    // static void StaticMethod(){
    //     System.out.println("Hello, Static Methods");
    // }

    public static void main(String[] args) {
        
        // StaticMethod();

        // Value Obj = new Value();
        // Obj.damage(200);
        // Obj.PublicMethod();

        //Data Member
        MemberLangganan Obj = new MemberLangganan("Gede Astu Nugraha",909089,"Gianyar");
        System.out.println(Obj.Id + " " + Obj.nama + " " + Obj.Location);
    }
}
