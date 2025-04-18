package Mutilthreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecuterService {
    public  List<Integer> method1() throws InterruptedException {
        Thread.sleep(2000);
        return Arrays.asList(1, 2, 3);
    }

    public  List<Integer> method2() throws InterruptedException  {
        Thread.sleep(2000);
        return Arrays.asList(4, 5, 6);
    }

    public  List<Integer> method3() throws InterruptedException {
        Thread.sleep(2000);
        return Arrays.asList(7, 8, 9);
    }

    public static void main(String[] args) {
        ExecuterService es= new ExecuterService();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService executorUsingVirtualThread = Executors.newVirtualThreadPerTaskExecutor(); //No need to define pool size

        // Define tasks as Callable objects
        Callable<List<Integer>> task1 = es::method1;
        Callable<List<Integer>> task2 = es::method2;
        Callable<List<Integer>> task3 = es::method3;

        try {
            // Submit tasks and get Future objects
            Future<List<Integer>> future1 = executor.submit(task1);
            Future<List<Integer>> future2 = executor.submit(task2);
            Future<List<Integer>> future3 = executor.submit(task3);

            Future<List<Integer>> futureVirtual1 = executorUsingVirtualThread.submit(task1);
            Future<List<Integer>> futureVirtual2 = executorUsingVirtualThread.submit(task2);
            Future<List<Integer>> futureVirtual3 = executorUsingVirtualThread.submit(task3);

            // Retrieve results
            List<Integer> result1 = future1.get();
            List<Integer> result2 = future2.get();
            List<Integer> result3 = future3.get();

            // Retrieve results using virtual
            List<Integer> resultVirtual1 = futureVirtual1.get();
            List<Integer> resultVirtual2 = futureVirtual2.get();
            List<Integer> resultVirtual3 = futureVirtual3.get();

            System.out.println("Print results using 3 threads using executer service");
            System.out.println("Result from method1: " + result1);
            System.out.println("Result from method2: " + result2);
            System.out.println("Result from method3: " + result3);

            Thread.sleep(4000);

            System.out.println("Print results using 3 threads using new Thread");
            Thread t1 = new Thread(() -> {
                try {
                    System.out.println(es.method1());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread t2 = new Thread(() -> {
                try {
                    System.out.println(es.method2());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread t3 = new Thread(() -> {
                try {
                    System.out.println(es.method3());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t1.start();
            t2.start();
            t3.start();
            Thread.sleep(4000);

            System.out.println("Print results using single threads");
            System.out.println(es.method1());
            System.out.println(es.method2());
            System.out.println(es.method3());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

}
