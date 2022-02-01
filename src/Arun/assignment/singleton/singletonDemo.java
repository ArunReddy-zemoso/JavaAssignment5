package Arun.assignment.singleton;

public class singletonDemo {
    public String str;
    public static  singletonDemo init(String st){
        str=st;
        return new singletonDemo();
    }
    public void Print(){
        System.out.println(str);
    }
}
