import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        manager.setExpenses(FileManager.load());

        while (true) {
            System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Save 6.Total 7.Export 8.Import 9.Exit");

            try {
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("ID: ");
                        int id = sc.nextInt();

                        System.out.print("Amount: ");
                        double amount = sc.nextDouble();

                        if (amount <= 0) {
                            System.out.println("Invalid amount!");
                            break;
                        }

                        System.out.print("Category: ");
                        String cat = sc.next();


                        System.out.print("Date (YYYY-MM-DD): ");
                        String date = sc.next();


                        manager.addExpense(new Expense(id, amount, cat, date));
                        break;


                    case 2:
                        manager.viewExpenses();
                        break;

                    case 3:
                        System.out.print("ID: ");
                        int uid = sc.nextInt();
                        System.out.print("New amount: ");
                        double newAmount = sc.nextDouble();
                        System.out.print("New category: ");
                        String newCat = sc.next();
                        manager.updateExpense(uid, newAmount, newCat);
                        break;

                    case 4:
                        System.out.print("ID: ");
                        int did = sc.nextInt();
                        manager.deleteExpense(did);
                        break;

                    case 5:
                        FileManager.save(manager.getExpenses());
                        break;

                    case 6:
                        System.out.println("Total = " + manager.getTotal());
                        break;

                    case 7:
                        CSVManager.exportCSV(manager.getExpenses());
                        break;

                    case 8:
                        manager.setExpenses(CSVManager.importCSV());
                        break;

                    case 9:
                        return;
                }

            } catch (Exception e) {
                System.out.println("Input error!");
                sc.nextLine();
            }
        }
    }
}