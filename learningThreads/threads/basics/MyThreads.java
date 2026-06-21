package learningThreads.threads.basics;

public class MyThreads extends Thread{
    public void run()
    {
       for(int i=1;i<=3;i++)
       {
           try
           {
               Thread.sleep(2000);
               System.out.println(i+" iam");
           }
           catch (InterruptedException e)
           {
               System.out.println(e.getMessage());
           }
       }
    }
}
