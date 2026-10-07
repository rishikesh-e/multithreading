// Runnable defines the task to be run by the Thread
// Runnable neither returns any value nor throws any error


public class UsingRunnable {
    public static void main(String[] args) {
        Runnable coding = () -> {
            System.out.println("Coding is managed by " + Thread.currentThread().getName());
        };

        Runnable debugging = () -> {
            System.out.println("Debugging is managed by " + Thread.currentThread().getName());
        };

        Runnable planning = () -> {
            System.out.println("Planning is managed by " + Thread.currentThread().getName());
        };

        Thread t1 = new Thread(coding);
        Thread t2 = new Thread(debugging);
        Thread t3 = new Thread(planning);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
