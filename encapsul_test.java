public class encapsul_test{
    private int q;

    public void set(int w){
        this.q = w;
        add();
    }
    public int get(){return this.q;}

    private void add(){
        this.q = this.q + 3;
    }


    public static void main(String[] args){
        encapsul_test myobj = new encapsul_test();
        myobj.set(4);
        System.out.println(myobj.get());
    }
}