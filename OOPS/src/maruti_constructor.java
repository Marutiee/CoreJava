class student{
    private int id;
    private String name;

    student(int a,String b){
        id=a;
        name=b;
    }
    student(int a,int b,int c){
        System.out.println("3 parameters");
    }

    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class maruti_constructor {
    public static void main(String[] args) {
        student m=new student(2,"Chiku");

        System.out.println("Id is "+m.getid());
        System.out.println("Name is "+m.getName());

    }
}
