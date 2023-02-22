package creational.singleton;

public class SingletonDoubleCheck {

    private SingletonDoubleCheck() {
    }
    private static SingletonDoubleCheck obj;

    public static SingletonDoubleCheck getObj(){

        if(obj == null){
            synchronized (SingletonDoubleCheck.class){
                if(obj == null){
                    obj = new SingletonDoubleCheck();
                    return obj;
                }
            }
        }
        return obj;
    }
}
