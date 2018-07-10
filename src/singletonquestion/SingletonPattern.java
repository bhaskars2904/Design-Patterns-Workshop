package singletonquestion;

public class SingletonPattern {
    public static void main(String[] args) {
        SingleObject s1 = new SingleObject();
        SingleObject s2 = new SingleObject();
        s1.i=1;
        s2.i=2;
        //Make appropriate changes in SingleObject and SingletonPattern class so that
        //the value for i remains same for both the instances, also ensure s1 = s2 i.e. instances of
        //SingleObject are not different. Also ensure the global access of this SingleObject's single instance
        System.out.println("s1.i = "+s1.i+", s1 = "+s1);
        System.out.println("s2.i = "+s2.i+", s2 = "+s2);

    }
}
