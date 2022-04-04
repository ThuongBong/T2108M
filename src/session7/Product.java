package session7;

public class Product {
    public String name;
    public Double price;
    public String unit;
    public Integer amount;

    public Product() {
    }

    public Product(String name, Double price, String unit, int amount) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        String s = "\n-----------------";
        s += "\n" +getName();
        s += "\n" + getPrice();
        s += "\n" + getAmount();
        s += "\n" + getUnit();
        return s;
    }
}
