package Java0121;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest3 {
	 
    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){//fileが見つけない場合、
            e.printStackTrace();//画面に表示してください。
        }
         
    }
 
}