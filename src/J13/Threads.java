package J13;

public class Threads implements Runnable{
    int work_item = 0;
    static final int threads = 4;
    static   final int WORK_ITEMS = 1000;
    private void pretend_to_work(int work_item){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    synchronized 
    private int incWorkitem(){
        return work_item++;
    }
    @Override
    public void run() {
        int mytask = 0;
        int myworkitems;

        while((myworkitems = incWorkitem())<WORK_ITEMS){
            pretend_to_work(work_item);
            mytask++;
        }
        System.out.println(Thread.currentThread().getName()+" did "+ mytask);
    }

    public static void main(String[] args) {
        Threads worker = new Threads();
        Thread[] thread = new Thread[threads];
        for(int i = 0; i<threads; i++){
            thread[i] = new Thread(worker, "Worker "+ i);
        }
        for(int i = 0; i<threads; i++)
            thread[i].start();

        System.out.println("Main thread is doing nothing...");
        for(int i = 0; i<threads; i++){
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("all done");

    }
}
