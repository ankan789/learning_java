class outerclass {
    
    class innerclass{
        public int q = 2;

    }    

    static outerclass.innerclass f1(){
        outerclass outerobj = new outerclass();
        outerclass.innerclass myobj = outerobj.new innerclass();
        return (myobj);
    }

    public static void main(String[] args){
        outerclass.innerclass veriable = f1();
        System.out.println(veriable.q);
    }


}

