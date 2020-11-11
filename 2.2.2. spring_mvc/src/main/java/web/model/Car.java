package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    String brand;
    int price;
    boolean isAvailable;

    public Car(String brand, int price, boolean isAvailable) {
        this.brand = brand;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
