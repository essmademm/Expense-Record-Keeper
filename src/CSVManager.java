import java.io.*;
import java.util.ArrayList;

public class CSVManager {

    public static void exportCSV(ArrayList<Expense> list) {
        try (PrintWriter pw = new PrintWriter("expenses.csv")) {
            for (Expense e : list) {
                pw.println(e.getId() + "," + e.getAmount() + "," + e.getCategory());
            }
            System.out.println("Exported to CSV!");
        } catch (Exception e) {
            System.out.println("Export error!");
        }
    }

    public static ArrayList<Expense> importCSV() {
        ArrayList<Expense> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("expenses.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                // Проверяем, что в строке достаточно данных (минимум 4 поля)
                if (data.length >= 4) {
                    list.add(new Expense(
                            Integer.parseInt(data[0]), // ID
                            Double.parseDouble(data[1]), // Amount
                            data[2],                     // Category
                            data[3]                      // Date
                    ));
                }
            }

            System.out.println("Imported from CSV!");
        } catch (Exception e) {
            System.out.println("Import error!");
        }
        return list;
    }
}
