public class publiclass{
    static int q = 5;
    static int w;
    public int e = 4;
    public int r;

    //static method can call static attribute
    static void f1(){
        System.out.println("from f1");
        System.out.println(q); //static attribute
        System.out.println(w); //static attribute after modified
    }

    //public method
    public void f2(){
        System.out.println("from f2");
        r = 600;
        System.out.println(e); //public attribute
        System.out.println(r); //public attribute after modified
    }

    public static void main(String[] args){
        w = 100;
        f1();
        System.out.println();

        //class object
        publiclass myobj = new publiclass();
        myobj.f2();

    }
}