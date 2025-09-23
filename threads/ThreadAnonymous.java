package threads;

public class ThreadAnonymous {
        public static void main(String[] args) {
                Thread t1 = new Thread(new Runnable() {
                        public void run() {
                                System.out.println("Thread using Anonymous Class");
                        }
                });

                t1.start();
        }
}