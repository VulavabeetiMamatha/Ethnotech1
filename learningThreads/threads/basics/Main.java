package learningThreads.threads.basics;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       MyThreads t=new MyThreads();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());

        for(int i=1;i<=3;i++)
        {
           t.join();
            System.out.println(i);
        }
    }
}
