package Java0123;

public class ScopeTest2 {
	static int i = 5;
	 
    static void a() {
        int i = 10;
        b();
    }
 
    static void b() {
    	//ex) int i = 30;  結果30を出す。
        System.out.println(i);//global variableない場合は、エラーを出る。
    }
 
    public static void main(String[] args) {
        a();
    }
}
