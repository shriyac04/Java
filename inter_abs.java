public interface inter_abs {
    void a();
    void b();
    void c();
}
abstract class B implements inter_abs{
    public void c(){
        System.out.println("i'm c");
    }
}
class M extends B{
    public void a(){
        System.out.println("i'm a");
    }
    public void b(){
        System.out.println("i'm b");
    }

}
class Test2{
    public static void main(String[] args) {
        M obj= new M();
        obj.a();
        obj.c();
        obj.b();
    }
}