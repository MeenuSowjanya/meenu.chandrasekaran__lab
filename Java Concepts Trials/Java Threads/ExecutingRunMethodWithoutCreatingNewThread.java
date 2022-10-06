public class ExecutingRunMethodWithoutCreatingNewThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello Meenu");
    }

    public static void main(String[] args) {
        Thread obj = new Thread(new ExecutingRunMethodWithoutCreatingNewThread());
        obj.run();
    }
}
