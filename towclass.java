public class towclass{
	public static void main(String[] args){
		System.out.println("twoclass");
		
		
		second obj = new second();
		int w = obj.func(obj.add());
		System.out.println(w);
	}
	
}

class second{
	static int func(int q){
		//System.out.println("second class");
		return 1+q;
	}
	
	static int add(){return 1;}
	
	/*public static void main(String[] args){
		func();
	}*/
}