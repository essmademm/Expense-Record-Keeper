import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static void save(ArrayList<Expense> list) {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("data.dat"))) {
            out.writeObject(list);
        } catch (Exception e) {
            System.out.println("Save error!");
        }
    }

    public static ArrayList<Expense> load() {
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("data.dat"))) {
            return (ArrayList<Expense>) in.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
