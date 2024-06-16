public class Test {
    public static void main(String[] args) {
        InnerTest_1 innerTest_1 = new InnerTest_1();
        innerTest_1.abstractMethod();
        innerTest_1.newMethod();
    }
}

abstract class InnerTest {
    public abstract void abstractMethod();
}

class InnerTest_1 extends InnerTest {

    public void newMethod() {
        System.out.println("Hello");
    }

    @Override
    public void abstractMethod() {
        System.out.println("hii");
    }

}