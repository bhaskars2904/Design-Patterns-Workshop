package singletonanswer;

public class SingletonPattern {
    public static void main(String[] args) {
        SingleObject s1 = SingleObject.getInstance();
        SingleObject s2 = SingleObject.getInstance();
        s1.i = 1;
        s2.i = 2;
        System.out.println("s1.i = "+s1.i+", s2.i = "+s2.i+", s1 = "+s1+", s2 = "+s2);
    }
}
