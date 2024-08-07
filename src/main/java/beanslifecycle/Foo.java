package beanslifecycle;

public class Foo {

    public void init() {
        System.out.println("Init method is called");
    }

    public void destroy() {
        System.out.println("destroy method is called");
    }
}
