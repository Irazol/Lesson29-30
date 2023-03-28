

import java.util.List;

public class Main2 {


    public static void main(String[] args) {
        DBWorker2 worker = new DBWorker2();

        List<User> user = worker.getAllData("SELECT * FROM user");
        System.out.println((char) 27 + "[35m" + "\nSELECT * FROM user\n"+(char)27 + "[0m");

        for (User users : user) {
            System.out.println(users);
        }

        List<User> user1 = worker.getAllData("SELECT * FROM user WHERE married = true");
        System.out.println((char) 27 + "[35m" + "\nSELECT * FROM user WHERE married = true\n"+(char)27 + "[0m");


        for (User users : user1) {
            System.out.println(users);
        }

        List<User> user2 = worker.getAllData("SELECT * FROM user WHERE married = true and age < 40");
        System.out.println((char) 27 + "[35m" + "\nSELECT * FROM user WHERE married = true and age < 40\n"+(char)27 + "[0m");

        for (User users : user2) {
            System.out.println(users);
        }

        List<User> user3 = worker.getAllData("SELECT * FROM user ORDER by age DESC");
        System.out.println((char) 27 + "[35m" + "\nSELECT * FROM user ORDER by age DESC\n"+(char)27 + "[0m");

        for (User users : user3) {
            System.out.println(users);
        }

        List<User> user4 = worker.getAllData("SELECT * FROM user WHERE age BETWEEN 10 and 30");
        System.out.println((char) 27 + "[35m" + "\nSELECT * FROM user WHERE age BETWEEN 10 and 30\"\n"+(char)27 + "[0m");

        for (User users : user4) {
            System.out.println(users);
        }

    }

}
