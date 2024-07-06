class attribute{
    static int a = 3;
    public int w = 9;

    static void f1(){
        System.out.println(a);
    }

    public static void main(String[] args){
        attribute my_obj = new attribute();
        System.out.println(a);
        System.out.println(my_obj.w);
        f1();
    }
}