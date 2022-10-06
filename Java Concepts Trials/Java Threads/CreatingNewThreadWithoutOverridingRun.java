public class CreatingNewThreadWithoutOverridingRun extends Thread{
    public static void main(String[] args) {
        Thread obj = new CreatingNewThreadWithoutOverridingRun();
        obj.start();
    }
}
