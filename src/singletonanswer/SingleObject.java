package singletonanswer;

public class SingleObject {
    int i;
    private static SingleObject singleObject;
    private SingleObject(){};
    public static SingleObject getInstance(){
        if(singleObject == null){               //Lazy Initialization
            singleObject = new SingleObject();
        }
        return singleObject;
    }
}
