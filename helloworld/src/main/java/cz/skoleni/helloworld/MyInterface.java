package cz.skoleni.helloworld;

public interface MyInterface {

    // DO JAVA 8
    /*public static final*/ String KONSTANTA = "neco";
    /*public abstract*/ void test();

    // OD JAVA 8 NAVIC:
    static void test2() {

    }

    default void test3() {

    }
}

class MyClass implements MyInterface {

    @Override
    public void test() {

    }

}