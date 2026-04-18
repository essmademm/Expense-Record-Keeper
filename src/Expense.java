import java.io.Serializable;

public class Expense implements Serializable {
    private int id;
    private double amount;
    private String category;

    public Expense(int id, double amount, String category) {
        this.id = id;
        this.amount = amount;
        this.category = category;
    }

    public int getId() { return id; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }

    public void setAmount(double amount) { this.amount = amount; }
    public void setCategory(String category) { this.category = category; }

    public void display() {
        System.out.println(id + " | " + amount + " | " + category);
    }
}
