package Java0121;

import java.util.Scanner;

public class ScannerTest2 {
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {//整数を入力すればtrueになり、整数以外のもの入力されるまでずっと反復する。
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
    }
 
}