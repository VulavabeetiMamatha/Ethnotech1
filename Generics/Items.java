package Generics;

public class Items <T,T1,T2>{
    T name;
    T1 price;
    T2 isGood;
    public Items(T name,T1 price,T2 isGood)
    {
        this.name=name;
        this.price=price;
        this.isGood=isGood;
    }

    public T getName() {
        return name;
    }

    public T1 getPrice() {
        return price;
    }

    public T2 getIsGood() {
        return isGood;
    }
}
