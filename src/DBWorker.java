

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DBWorker {

    private final String URL = "jdbc:mysql://localhost:3306/users";
    private final String LOGIN = "root";
    private final String PASSWORD = "root";



    public DBWorker() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllData() {
        Connection connection = null;
        Statement statement = null;
        List<User> data = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть SQL-запит:");
        String a = input.nextLine();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(a);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String first_name = resultSet.getString(2);
                String last_name = resultSet.getString(3);
                int age = resultSet.getInt(4);
                boolean married = resultSet.getBoolean(5);
                String phone = resultSet.getString(6);
                String e_mail = resultSet.getString(7);
                User user = new User(id, first_name,  last_name,  age,  married,  phone,  e_mail);
                data.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return data;
    }

}
