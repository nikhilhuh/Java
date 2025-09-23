package threads;

public class ThreadLambda {
        public static void main(String[] args) {
                Thread t1 = new Thread(() -> {
                        System.out.println("Thread using lambda");
                });

                t1.start();
        }
}
