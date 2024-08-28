public class ThrowsTest {
    void stdco() throws InterruptedException {
        System.out.println("Throws work");
    }

    void hod() throws InterruptedException {
        stdco();
    }

    void principal() throws InterruptedException {
        hod();
    }

    public static void main(String[] args) throws InterruptedException {
        ThrowsTest obj = new ThrowsTest();
        obj.principal();
    }
}
