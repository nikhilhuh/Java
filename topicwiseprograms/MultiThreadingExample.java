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

public class MultiThreadingExample {
        public static void main(String[] args) {
                Thread task = new CookingTask("Pasta");
                Thread job = new Thread(new CookingJob("Washing Dishes"));

                task.start();
                job.start();
        }
}
