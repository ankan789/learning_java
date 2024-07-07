class test{
    //public void f1();
    public int q;
}

public class generaltest extends test{
    
    
    
    public void f1(){System.out.println("abcd");}

    public static void main(String[] args){
        generaltest myobj = new generaltest();
        myobj.q = 5;

        System.out.println(myobj.q);


    }
}