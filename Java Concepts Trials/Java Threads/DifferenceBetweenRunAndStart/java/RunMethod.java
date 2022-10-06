package DifferenceBetweenRunAndStart.java;

public class RunMethod implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread obj = new Thread(new RunMethod());
        System.out.println("Thread starts");
        obj.run();
        System.out.println("Thread ends");
    }
}
