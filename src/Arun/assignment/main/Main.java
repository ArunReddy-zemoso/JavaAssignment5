package Arun.assignment.main;
import Arun.assignment.data.DefaultInit;
import Arun.assignment.singleton.singletonDemo;
public class Main {
    public static void main(String[] args) {
        DefaultInit dobj=new DefaultInit();
        dobj.printInfo();
        dobj.printLocal();

        //compilation error because loval variables are not initialized

        singletonDemo sobj=singletonDemo.init("Arun");
        sobj.Print();
        //compilation error because non-static variable str cannot be referenced from a static context
    }
}
