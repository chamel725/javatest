package Java0123;

public class ScopeTest {

	 static void a(){
	        String title = "coding everybody";
	       // System.out.println("title");
	    }
	    public static void main(String[] args) {
	        a();
	        //System.out.println(title);
	    }
	    
	    /*public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {
	            System.out.println(i);
	        }
	        // System.out.println(i);
	    }*/
	 
}
