package Java0118;
//・メソッド
public class Method {			//メソッド定義
    public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(); /* メソッド呼び出し
        == int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        *public static void main(String[] args)の中に
        *実行できることを望むlogicを位置すること。
        */
    }
}
