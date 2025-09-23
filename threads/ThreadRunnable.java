package threads;

class CookingJob implements Runnable{
        String task;

        CookingJob(String task){
                this.task = task;
        }

        public void run(){
                System.out.println(task + " is being prepared by " + Thread.currentThread().getName());
        }
}

public class ThreadRunnable {
        public static void main(String[] args){
                Thread t1 = new Thread(new CookingJob("Pasta"));
                Thread t2 = new Thread(new CookingJob("Rice"));
                Thread t3 = new Thread(new CookingJob("Salad"));
                Thread t4 = new Thread(new CookingJob("Dessert"));

                t1.start();
                t2.start();
                t3.start();
                t4.start();
        }
}
