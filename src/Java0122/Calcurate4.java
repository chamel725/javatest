package Java0122;

	class Calculator3{
		  
	    public static void sum(int left, int right){
	        System.out.println(left+right);
	    }
	     
	    public static void avg(int left, int right){
	        System.out.println((left+right)/2);
	    }
	}
	 
	public class Calcurate4 {
	     
	    public static void main(String[] args) {
	        Calculator3.sum(10, 20);//classで直接接近する。一回だけ使う時、メモリー節約。
	        Calculator3.avg(10, 20);
	         
	        Calculator3.sum(20, 40);
	        Calculator3.avg(20, 40);
	    }
	 
	}
