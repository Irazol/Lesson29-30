import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Inputdata {

    private static final String URL = "jdbc:mysql://localhost:3306/users";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        Statement statement = null;


        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            statement.addBatch("INSERT INTO user(first_name, last_name, age, married, phone, e_mail)" +
                    " VALUES ('Clancy', 'Wiggum', 40, true, '+13736686263', 'ncrooks@gmail.com')");
            statement.addBatch("INSERT INTO user(first_name, last_name, age, married, phone, e_mail)" +
                    " VALUES ('John', 'Zoidberg', 98, false, '+13877212212', 'kendrick65@gmail.com')");
            statement.addBatch("INSERT INTO user(first_name, last_name, age, married, phone, e_mail)" +
                    " VALUES ('Erling', 'Feest', 40, true, '0796658285', 'emie57@gmail.com')");
            statement.addBatch("INSERT INTO user(first_name, last_name, age, married, phone, e_mail)" +
                    " VALUES ('Ross', 'Leffler', 18, false, '0819601861', 'dsawayn@gmail.com')");
            statement.addBatch("INSERT INTO user(first_name, last_name, age, married, phone, e_mail)" +
                    " VALUES ('Aurelio', 'Volkman', 31, true, '04412892059', 'shaniya.harris@yahoo.com')");
            statement.addBatch("INSERT INTO user(first_name, last_name, age, married, phone, e_mail)" +
                    " VALUES ('Sterling', 'Cartwright', 25, false, '04060668243', 'alicia31@gmail.com')");


            statement.executeBatch();

            boolean closed = statement.isClosed();
            System.out.println(closed);


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
    }

    private static void registerDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
