package MultiThreading;

class FirstTask extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Hello from Thread 1");
        }
    }
}
class SecondTask extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Hello from Thread 2");
        }
    }
}
public class PrintTwoThread {
    public static void main(String[] args) {
        FirstTask t1=new FirstTask();
        SecondTask t2=new SecondTask();

        t1.start();
        t2.start();
    }
}
