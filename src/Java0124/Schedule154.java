package Java0124;

class Apple{
	private int seeds;
	//insert code here
	
/*	public Apple(int seeds) {
		this.seeds = seeds;
	}*/
	
	Apple(int seeds){
		this.seeds = seeds;
	}
	
	public void disp() {
		System.out.println("seeds : "+ seeds);
	}
}
class Test{
	public static void main(String[] args) {
		Apple apple = new Apple(5);
		apple.disp();
	}
}
