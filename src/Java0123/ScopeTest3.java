package Java0123;


	class C3 {
	    int v = 10;
	 
	    void m() {
	        int v = 20;
	        System.out.println(this.v);//this.v = global variableの値を指す。
	    }
	}
	 
	public class ScopeTest3 {
	 
	    public static void main(String[] args) {
	        C3 c1 = new C3();
	        c1.m();
	    }
}
