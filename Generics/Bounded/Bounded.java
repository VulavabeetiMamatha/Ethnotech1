package Generics.Bounded;

public class Bounded <T extends Number>{
    T price;

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }
}
