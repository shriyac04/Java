public interface inter {
    void print();
    static void pi(){        // static methods with implementation in interface
        System.out.println("1");
    };

}
class A6 implements inter{
    public void print(){System.out.println("Hello");  // this can't be static cause it has to be overridden
    }
    public static void p(){ // this can be static as it is not the method of interface
        System.out.println("h");
    }
    public static void main(String args[]){
        A6 obj = new A6();
        obj.print();
        p();
        inter.pi();
    }
}
