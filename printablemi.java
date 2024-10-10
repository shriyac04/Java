public interface printablemi {
void print();
}
interface Showable{
    void show();
}
class A implements printablemi,Showable{
    public void print(){
        System.out.println("i'm allowed to print");
    }
    public void show(){
        System.out.println("i'm allow to show the reality");
    }
    public static void main(String[] args) {
        A obj= new A();
        obj.print();
        obj.show();
    }

}

