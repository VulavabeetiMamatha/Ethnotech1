package learningThreads.MultiThreads;

class Rc
{
    int count=0;
    //this give random output because both thread excute at a time
    void  increment()
    {
        count++;
    }
    /*Method syncronization
    void synchronized increment()
    {
        count++;
    }
   */

    /*Block syncronization
    void  increment()
    {
    system.out.println("thread");
    syncronized(this)
    {
        count++;
    }
    system.out.println("done");
    }

     */
}
public class RaceCondition   {
    public static void main(String[] args) throws InterruptedException {
        Rc r=new Rc();
        Thread t1=new Thread(()->  //Lamba for create thread
        {
            for(int i=1;i<1000;i++)
            {
                r.increment();
            }
        });

        Thread t2=new Thread(()->
        {
            for(int i=1;i<1000;i++)
            {
                r.increment();
            }
        });
        t1.start();
        t2.start();
        //Thread are working like switching one thread to another and main so after thread execution main will exeute for this we use join
        t1.join();
        t2.join();
        System.out.println(r.count);
    }
}
