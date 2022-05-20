package DifferenceBetweenRunAndStart.java;

public class StartMethod implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread obj = new Thread(new RunMethod());
        System.out.println("Thread starts");
        obj.start();
        System.out.println("Thread ends");
    }
}
