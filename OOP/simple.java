class simple{
    void f1(){
        System.out.println("from f1");
    }
    static void f2(){
        System.out.println("from f2");
    }
    public void f3(){
        System.out.println("from f3");
    }
    public void call_f1(){
        f1();
    }

public static void main(String[] args){
    System.out.println("from main");

    //create object
    simple my_obj = new simple();
    my_obj.f1();

    //call a static method
    f2();
    
    

    //call a public method
    my_obj.f3();
    my_obj.call_f1();

}
    
}