package creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getObj();
        Singleton s2 = Singleton.getObj();
        Singleton s3 = Singleton.getObj();

        SingletonMultiThreading s4 = SingletonMultiThreading.getObj();
        SingletonMultiThreading s5 = SingletonMultiThreading.getObj();
        SingletonMultiThreading s6 = SingletonMultiThreading.getObj();

        SingletonDoubleCheck s7 = SingletonDoubleCheck.getObj();
        SingletonDoubleCheck s8 = SingletonDoubleCheck.getObj();
        SingletonDoubleCheck s9 = SingletonDoubleCheck.getObj();
    }
}
