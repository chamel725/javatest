package Java0121;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){//privateはclass外では接近できない。
        return "public void z()";
    }
    public String x(){//ｚは同じclassのため呼び出しができる。
        return z();
    }
}
public class AccessTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 下のコードはエラーが発生する。
        //System.out.println(a.z());
        System.out.println(a.x());
    }
}