import java.io.*;
class m{
    void method() throws IOException{
        System.out.println("device operation performed");

    }
}
class except_declare{
    public static void main(String[] args) throws IOException {
     m m1 = new m();
     m1.method();
        System.out.println("normal");
    }
}
