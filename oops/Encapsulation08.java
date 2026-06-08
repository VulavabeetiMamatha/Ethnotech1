package oops;

class Access1{
    public int a=10;
    private int b=5;
    protected int c=30;
    int d=40;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
class Access2 extends Access1{
    void pribtData()
    {
        System.out.println(a);
        System.out.println(getB());
        System.out.println(c);
        System.out.println(d);
    }
}
public class Encapsulation08 {
    public static void main(String[] args) {
        Access2 acc=new Access2();
        acc.pribtData();
    }
}
