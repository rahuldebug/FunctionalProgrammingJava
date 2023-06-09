package lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("old way to do stuff");
            }
        });
        t1.run();
        Runnable runnable= ()->{
            System.out.println("do stuff in new way ");
        };
        Thread t2= new Thread(runnable);
        t2.start();
    }
}
