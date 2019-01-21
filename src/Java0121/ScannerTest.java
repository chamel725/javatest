package Java0121;

import java.util.Scanner;//バッケージ

public class ScannerTest {
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);//new Scanner(System.in):ユーザーが入力した値をscanする。
    	int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
    }
}