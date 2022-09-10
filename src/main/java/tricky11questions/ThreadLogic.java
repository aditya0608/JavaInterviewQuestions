package tricky11questions;

public class ThreadLogic {
    public static void main(String[] args) {
        final class Constants{
            public  static String name="PI";
        }
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Constants.name="hello");
            }
        });
        thread.start();
    }
}
