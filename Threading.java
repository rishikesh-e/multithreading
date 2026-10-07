class Task extends Thread {
    private String name;
    public Task(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name + " is managed by " + Thread.currentThread().getName());
    }
}

public class UsingThread {
    public static void main(String[] args) {
        Thread t1 = new Task("Coding");
        Thread t2 = new Task("Debugging");
        Thread t3 = new Task("Planning");
        t1.start();
        t2.start();
        t3.start();
    }
}
