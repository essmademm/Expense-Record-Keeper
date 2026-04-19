import java.io.Serializable;

public class Expense implements Serializable {
    private int id;
    private double amount;
    private String category;
    private String date;

    public Expense(int id, double amount, String category,String date) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public int getId() { return id; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public String getDate() { return date; }

    public void setAmount(double amount) { this.amount = amount; }
    public void setCategory(String category) { this.category = category; }

    public void display() {
        System.out.println(id + " | " + amount + " | " + category+ " | " + date + " | Personal" );
    }
    public String toCsv() {
        return id + "," + amount + "," + category + "," + date + ",Personal";
    }
}
