package learningThreads.MultiThreads;


class Booking
{
    int seats=100;
    public synchronized void book(String name,int seat)
    {
    if(seats>seat)
    {
        System.out.println(name +" booked seats"+ seat);
        seats=seats-seat;
    }
    else if(seats>0)
    {
        System.out.println(seats+"only remaining");
    }
    else
    {
        System.out.println("No seats left");
    }
   }
}
public class Syncronization{
    public static void main(String[] args) throws InterruptedException {
        Booking r=new Booking();
        Thread t1=new Thread(()->  //Lamba for create thread
        {
            r.book("Mamatha",20);
        });

        Thread t2=new Thread(()->
        {
             r.book("Aadhya",90);

        });
        t1.start();
        t2.start();
        //Thread are working like switching one thread to another and main so after thread execution main will exeute for this we use join
        t1.join();
        t2.join();
        System.out.println(r.seats);
    }
}


