class multimethod{
    private int q;
    public multimethod set(int w){
        System.out.println("value is seted");
        this.q = w;
        return this;
    }
    public multimethod f2(){
        System.out.println("value is : "+this.q);
        return this;
    }

    public int f1(){return 1;}

}