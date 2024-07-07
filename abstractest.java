abstract class test{
    abstract int q;
    abstract void f1();

    public int get(){return this.q;}
}

public class abstractest extends test{
    void f1(){System.out.println("from f1");}

    public static void main(String[] args){
        abstractest myobj = new abstractest();
        myobj.f1();
        System.out.println(myobj.get());

    }
}