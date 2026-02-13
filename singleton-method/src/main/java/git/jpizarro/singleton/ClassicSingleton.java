package git.jpizarro.singleton;

public class ClassicSingleton {

    private ClassicSingleton(){}

    private static class Holder {
        private static final ClassicSingleton INSTANCE = new ClassicSingleton();
    }

    public static ClassicSingleton getInstance(){
        return Holder.INSTANCE;
    }

    public void doSomething(){
        System.out.println("Trabajando desde el Singleton clásico...");
    }

}
