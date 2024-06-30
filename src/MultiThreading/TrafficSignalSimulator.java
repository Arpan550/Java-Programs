package MultiThreading;

enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMills;

    TrafficColor(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }

    public int getOnTimeInMills() {
        return onTimeInMills;
    }
}

class TrafficLightThread extends Thread {
    private final TrafficColor color;

    TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s is inactive\n", color);
    }
}

public class TrafficSignalSimulator {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red=new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread yellow=new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread green=new TrafficLightThread(TrafficColor.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
        green.join();
    }
}