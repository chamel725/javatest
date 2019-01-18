package Java0118;

public class Method_Output {
	
	public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        /* 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        	作れる数字をOUTPUTという変数に入れるため、空き値を設定した。*/
        
        while (i < limit) {
            /* 숫자를 화면에 출력하는 대신 변수 output에 담았다.
        	数字を画面に表す代わりに変数OUTPUTに入れた。*/
            output += i;// output = output + i; 1 2 3 4 
            i++;
        }
        /* 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을
         배치하면 된다.*/
        return output;
        //String numberingはnumberingがreturnする形は必ず文字列ということを指す。
    }
 
    public static void main(String[] args) { //void return값 x
        String result = numbering(1, 5);/*result는 반드시 String data type이어야 한다.
     //메소드 numbering이 리턴한 값이 변수 result에 담긴다.
    	 メソッドnumberingがreturnした値が変数resultに入れる。*/
        System.out.println(result);
        /* 변수 result의 값을 화면에 출력한다.
        	変数resultの値を画面に出力する。*/
    }
}
