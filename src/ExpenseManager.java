import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense e) {
        expenses.add(e);
    }

    public void viewExpenses() {
        for (Expense e : expenses) {
            e.display();
        }
    }

    public void deleteExpense(int id) {
        expenses.removeIf(e -> e.getId() == id);
    }

    public void updateExpense(int id, double amount, String category) {
        for (Expense e : expenses) {
            if (e.getId() == id) {
                e.setAmount(amount);
                e.setCategory(category);
            }
        }
    }

    public double getTotal() {   // ← extra для защиты
        double sum = 0;
        for (Expense e : expenses) {
            sum += e.getAmount();
        }
        return sum;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(ArrayList<Expense> expenses) {
        this.expenses = expenses;
    }
}
