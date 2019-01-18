package Java0118;

public class Method_Input2 {
	public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(1, 5);//入力する順番通りにparameterに値が入れる。
    }
}
