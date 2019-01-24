package Java0123;

public class ScopeTest1 {
    static int i;//global variables
     
    static void a() {
       int i = 0;	//local variables
        		//int i = 0; で変える場合は、｛｝以内で新しく値が入るようになって結果が違うようになる。
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {//(int i = 0; i < 5; i++) 上と同じように結果が変化する。
            a();
            System.out.println(i);
        }
    }
 
}
