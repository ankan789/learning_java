interface test{
    public void f1();
    static int q = 9;
}

public class interfacetest implements test{
    public void f1(){System.out.println("from f1");}
    //public int q = 3;
    public static void main(String[] args){
        interfacetest myobj = new interfacetest();

        myobj.f1();
        System.out.println(myobj.q);
    }
}