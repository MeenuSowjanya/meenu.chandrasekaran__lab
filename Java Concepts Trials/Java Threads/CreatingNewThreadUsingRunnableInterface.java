public class CreatingNewThreadUsingRunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Meenu");
    }

    public static void main(String[] args) {
        Thread obj = new Thread(new CreatingNewThreadUsingRunnableInterface());
        obj.start();
    }
}
