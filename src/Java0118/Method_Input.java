package Java0118;

public class Method_Input {
	    public static void numbering(int limit) {
	    	/*(int limit):parameter  */
	        int i = 0;
	        while (i < limit) {
	            System.out.println(i);
	            i++;
	        }
	    }
	 
	    public static void main(String[] args) {
	        numbering(5);
	        /*(5):arguement()の中にlimitに入る値を指定して
	          		メソッドの計算をする。
	        */
	    }
	}

