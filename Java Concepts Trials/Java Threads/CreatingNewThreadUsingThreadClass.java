public class CreatingNewThreadUsingThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("Hello Meenu");
    }

    public static void main(String[] args) {
        Thread obj = new CreatingNewThreadUsingThreadClass();
        obj.start();
    }
}
