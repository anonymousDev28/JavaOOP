package Data;

public class Product {
    private int id;
    private String name;
    private String desc;
    private int amount;
    private double price;
    private String unit;
    private static int sID;

    public Product() {
    }

    public Product(String name, String desc, int amount, double price, String unit) {
        this.name = name;
        this.desc = desc;
        this.amount = amount;
        this.price = price;
        this.unit = unit;
        this.id = ++sID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", desc: '" + desc + '\'' +
                ", amount: " + amount +
                ", price: " + price +
                ", unit: '" + unit + '\'' +
                '}';
    }
}
