public interface def {
    void draw();
    default void show(){
        System.out.println("I'm just here to show the default side ");
    }

}
class Rec implements def{
    public void draw() {
        System.out.println("i'm drawing");
    }
}
class test{
    public static void main(String[] args) {
        Rec A= new Rec();
        A.draw();
        A.show();
    }
}