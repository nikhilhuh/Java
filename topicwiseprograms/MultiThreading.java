// Create thread using Thread class & Runnable interface.

package topicwiseprograms;

class  CookingTask extends Thread {
        private String task;

        CookingTask(String task) {
                this.task =  task;
        }

        public void run() {
                System.out.println(task + " is being prepared by " + Thread.currentThread().getName());
        }

}

class  CookingJob implements Runnable {
        private String job;

        CookingJob(String job) {
                this.job = job;
        }

        public void run() {
                System.out.println(job + " is being processed by " + Thread.currentThread().getName());
        }

}

public class MultiThreading {
        public static void main(String[] args) {
                Thread task = new CookingTask("Pasta");
                Thread job = new Thread(new CookingJob("Washing Dishes"));

                task.start();
                job.start();
        }
}

// Output ->
// Pasta is being prepared by Thread-0
// Washing Dishes is being processed by Thread-1