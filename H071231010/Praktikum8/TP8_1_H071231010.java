import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TP8_1_H071231010 {
    static int totalData = 4;
    static int successCount = 0;
    static int failureCount = 0;
    static boolean[] threadResults = new boolean[totalData];
    static ExecutorService executor = Executors.newFixedThreadPool(3);
    static boolean allDataLoaded = false;
    static int elapsedTime = 0;

    public static void main(String[] args) {
        System.out.println("Start load " + totalData + " data");

        // UI Thread
        Thread uiThread = new Thread(() -> {
            while (!allDataLoaded) {
                System.out.println("Loading... (" + (++elapsedTime) + "s)");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        uiThread.start();

        for (int i = 0; i < totalData; i++) {
            final int dataId = i;
            executor.execute(() -> {
                int time = TaskTimeHelper.getRandomTime();
                try {
                    Thread.sleep(time * 1000);
                    if (time > 4) {
                        System.out.println("Request Timeout");
                        threadResults[dataId] = false;
                        failureCount++;
                    } else {
                        System.out.println("Data " + dataId + " loaded in " + time + "s.");
                        threadResults[dataId] = true;
                        successCount++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                checkAllDataLoaded();
            });
        }

        executor.shutdown();
    }

    static synchronized void checkAllDataLoaded() {
        if (successCount + failureCount == totalData && !allDataLoaded) {
            allDataLoaded = true;
            System.out.println("\nTask Finish.");
            System.out.println("Time Execution : " + elapsedTime + "s");
            if (failureCount == 0) {
                System.out.println("All data is successfully loaded\n");
            } else {
                System.out.println(successCount + " Data Successfully loaded & " + failureCount + " data failed to load\n");
            }
        }
    }
}

class TaskTimeHelper {
    static Random random = new Random();

    static int getRandomTime() {
        return random.nextInt(6);
    }
}
