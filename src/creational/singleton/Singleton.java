package creational.singleton;

public class Singleton {

    //private constructor
    private Singleton() {
    }

    //private Static object reference
    private static Singleton obj;

    //public static method for object creation
    public static Singleton getObj(){
        if(obj == null){
            obj =  new Singleton();
            return obj;
        }
        return obj;
    }
}
