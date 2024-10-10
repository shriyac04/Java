public abstract class abstracts {
abstract void run();
}
class Honda4 extends abstracts{
void run(){
    System.out.println("running safely");
}

    public static void main(String[] args) {
        abstracts obj=new Honda4();
        obj.run();
    }
}
