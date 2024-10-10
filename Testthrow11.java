import java.io.IOException;
class Testthrows11{
    void m()throws IOException{
        throw new IOException("device error");//checked exception
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        Testthrows11 obj=new Testthrows11();
        obj.p();
        System.out.println("normal flow...");
    }
}