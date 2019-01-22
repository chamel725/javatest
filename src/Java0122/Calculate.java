package Java0122;

public class Calculate {
	
	public static void sum(int left, int right) {
		System.out.println(left + right);	//より、効率的に計算できるし、維持・補修することに便利。
	}
	
	public static void main(String[] arg) {
		sum(10,20);
		sum(20,30);
	}
}
