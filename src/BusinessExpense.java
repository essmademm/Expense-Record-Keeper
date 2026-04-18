public class BusinessExpense extends Expense {
    private String company;

    public BusinessExpense(int id, double amount, String category, String date, String company) {
        super(id, amount, category, date); // Вызов конструктора родителя
        this.company = company;
    }

    @Override
    public void display() {
        System.out.println(getId() + " | " + getAmount() + " | " + getCategory() + " | " + getDate() + " | Business (" + company + ")");
    }

}


