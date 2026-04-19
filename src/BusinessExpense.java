public class BusinessExpense extends Expense {
    private String company;

    public BusinessExpense(int id, double amount, String category, String date, String company) {
        super(id, amount, category, date);
        this.company = company;
    }
    // Requirement 10: Polymorphism (Method Overriding)
    @Override
    public void display() {
        System.out.println(getId() + " | " + getAmount() + " | " + getCategory() +  " | Business (" + company + ")");
    }
    @Override
    public String toCsv() {
        return getId() + "," + getAmount() + "," + getCategory() + "," + getDate() + ",Business," + company;
    }

}


