import java.util.concurrent.*;

public class UsingCallable {
    public static void main(String[] args) throws Exception {
        // Executor is an Interface which is used to execute tasks
        // ExecutorService is an interface that extends Executor
        // It has additional features like submit(), managing lifecycle, shutdown() etc..,
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Callable is similar to Runnable, used to define a task that is to be done by a Thread
        // The core difference is Callable does return something and can throw errors while Runnable can't
        Callable<String> t1 = () -> {
            return "t1 is managed by " + Thread.currentThread().getName();
        };

        Callable<String> t2 = () -> {
            return "t2 is managed by " + Thread.currentThread().getName();
        };

        Callable<String> t3 = () -> {
            return "t3 is managed by " + Thread.currentThread().getName();
        };
        
        // Future Interface is used to capture the result of a Task running asynchronously 
        // When future.get() is called, if the task isn't finished yet, the current thread waits until the result is available
        Future<String> res1 = executorService.submit(t1);
        Future<String> res2 = executorService.submit(t2);
        Future<String> res3 = executorService.submit(t3);
        
        System.out.println(res1.get());
        System.out.println(res2.get());
        System.out.println(res3.get());

        executorService.shutdown();
    }
}
