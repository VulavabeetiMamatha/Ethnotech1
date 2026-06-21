package learningThreads.MultiThreads.InterThreadCommunication;

class Message
{
    boolean isMsg=false;
    public synchronized void receiver() throws InterruptedException {
        while(!isMsg)
        {
            System.out.println("Waiting for message");
            wait();
        }
        System.out.println("Message received");
    }
    public synchronized void sender()
    {
        isMsg=true;
        System.out.println("Message sent");
        notify();
    }
}
public class ITC {
    public static void main(String[] args) throws InterruptedException {
        Message m=new Message();
        Thread t1=new Thread(()->
        {
            try {
                m.receiver();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2=new Thread(()->
        {
            m.sender();//add sleep to execute receiver thread first because we dont know which thread to be executed first
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
