package uniq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class signup {
	    private static final String DB_URL = "jdbc:mysql://localhost:3306/uniq";
	    private static final String DB_USER = "root";
	    private static final String DB_PASSWORD = "subha172002";

	    public static void main(String[] args) {
	        // Simulated user input
	        String name = "subha";
	        String password = "123";

	        // Check if the email and password match in the database
	        boolean credentialsMatch = checkCredentials(name, password);

	        if (credentialsMatch) {
	            System.out.println("User exists and password is correct. Proceed with login.");
	        } else {
	            System.out.println("User does not exist or the password is incorrect.");
	        }
	    }

	    private static boolean checkCredentials(String name, String pass) {
	        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	             PreparedStatement statement = connection.prepareStatement("SELECT * FROM student1 WHERE name = ? AND pass= ?")) {

	            statement.setString(1, name);
	            statement.setString(2, pass);

	            ResultSet resultSet = statement.executeQuery();

	            return resultSet.next();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	      
	        return false;
	    }
}

