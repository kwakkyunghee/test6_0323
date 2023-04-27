package kr.hs.study;

public class TestBean {
    private int a;
    private int b;

    public TestBean(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void prData(){
        if(a/10 == b%10){
            System.out.println("a의 10의 자리와 b의 1의 자리가 같습니다");
        }
        else System.out.println("같지 않습니다");
    }
}
