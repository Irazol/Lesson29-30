

import java.util.List;

public class Main {


    public static void main(String[] args) {
        DBWorker worker = new DBWorker();
        List<User> user = worker.getAllData();

        for (User users : user) {
            System.out.println(users);
        }
    }

}
