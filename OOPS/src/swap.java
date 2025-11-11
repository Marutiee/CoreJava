class twoNumber{
    public void before(int a, int b){
        System.out.println("Before");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }

    public void after(int a, int b){
        System.out.println("After");
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}

public class swap {
    public static void main(String[] args) {
        twoNumber s=new twoNumber();

        s.before(3,5);
        s.after(3,5);

    }
}
