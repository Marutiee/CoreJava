class student{
    int id;
    String name;

    student(int a,String b){
        System.out.println("2 parameters");
    }
    student(int a,int b,int c){
        System.out.println("3 parameters");
    }
}
public class maruti_constructor {
    public static void main(String[] args) {
        student m=new student(8,6, 7);


    }
}
