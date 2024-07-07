import mypak.*;
public class imprtpak{
    public static void main(String[] args){
        mypak.packagetest myobj = new mypak.packagetest();

        myobj.set("abcd");
        System.out.println(myobj.get());
    }
}