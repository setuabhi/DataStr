package Mutilthreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecuterService {
    public static void main(String[] args) {
        ExecuterService es = new ExecuterService();

        ExecutorService executor = Executors.newFixedThreadPool(2); //We assigned two threads so, method3 will wait
        ExecutorService executorUsingVirtualThread = Executors.newVirtualThreadPerTaskExecutor(); //No need to define pool size, all will execute together

        // Define tasks as Callable objects
        Callable<List<Integer>> task1 = ()->es.method1();
        Callable<List<Integer>> task2 = ()->es.method2();;
        Callable<List<Integer>> task3 = ()->es.method3();;

        try {
            // Submit tasks and get Future objects
            Future<List<Integer>> future1 = executor.submit(task1);
            Future<List<Integer>> future2 = executor.submit(task2);
            Future<List<Integer>> future3 = executor.submit(task3);

            Future<List<Integer>> futureVirtual1 = executorUsingVirtualThread.submit(task1);
            Future<List<Integer>> futureVirtual2 = executorUsingVirtualThread.submit(task2);
            Future<List<Integer>> futureVirtual3 = executorUsingVirtualThread.submit(task3);


            System.out.println("Print results using 3 threads using executor service");
            System.out.println("Result from method1: " + future1.get());
            System.out.println("Result from method2: " + future2.get());
            System.out.println("Result from method3: " + future3.get());

            Thread.sleep(5000);

            System.out.println("Print results using 3 threads using executor service virtual thread");
            System.out.println("Result from method1: " + futureVirtual1.get());
            System.out.println("Result from method2: " + futureVirtual2.get());
            System.out.println("Result from method3: " + futureVirtual3.get());


        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    public List<Integer> method1() throws InterruptedException {
        Thread.sleep(5000);
        return Arrays.asList(1, 2, 3);
    }

    public List<Integer> method2() throws InterruptedException {
        Thread.sleep(5000);
        return Arrays.asList(4, 5, 6);
    }

    public List<Integer> method3() throws InterruptedException {
        Thread.sleep(5000);
        return Arrays.asList(7, 8, 9);
    }

}
