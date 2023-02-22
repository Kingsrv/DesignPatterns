package creational.singleton;

public class SingletonMultiThreading {

    private SingletonMultiThreading() {
    }

    private static SingletonMultiThreading obj;

    public synchronized static SingletonMultiThreading getObj(){

        if(obj == null){
            obj = new SingletonMultiThreading();
            return obj;
        }else{
            return obj;
        }
    }
}
