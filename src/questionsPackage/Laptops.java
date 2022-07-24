package questionsPackage;

import java.util.Comparator;

public class Laptops implements Comparable<Laptops> {
    private String brandName;
    private int price;
    private int ramSize;

    public Laptops(String brandName, int price, int ramSize) {
        this.brandName = brandName;
        this.price = price;
        this.ramSize = ramSize;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                ", ramSize=" + ramSize +
                '}';
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }


    @Override
    public int compareTo(Laptops o) {
        if (this.getPrice() > o.getPrice()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
