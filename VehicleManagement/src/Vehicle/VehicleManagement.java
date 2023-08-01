package Vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

		public class VehicleManagement {
		    private static final String DB_URL = "jdbc:mysql://localhost:3306/yesh?useSSL=false";
		    private static final String DB_USER = "root";
		    private static final String DB_PASS = "Root12";

		    public static void main(String[] args) {
		     
		        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
		            Scanner scanner = new Scanner(System.in);
		            System.out.println("Welcome to Vehicle Management System!");
		            int option;

		            do {
		                System.out.println("Choose an option:");
		                System.out.println("1. Add Vehicle");
		                System.out.println("2. Add Fuel");
		                System.out.println("3. Add Driver");
		                System.out.println("4. Exit");
		                System.out.print("Enter your choice: ");
		                option = scanner.nextInt();

		                switch (option) {
		                    case 1:
		                       
		                        System.out.print("Enter Vehicle Name: ");
		                        String vehicleName = scanner.next();
		                        System.out.print("Enter Vehicle Type: ");
		                        String vehicleType = scanner.next();

		                        addVehicle(connection, vehicleName, vehicleType);

		                        System.out.println("Vehicle Added Successfully!");
		                        break;
		                    case 2:
		                       
		                        System.out.print("Enter Fuel Type: ");
		                        String fuelType = scanner.next();
		                        System.out.print("Enter Fuel Price: ");
		                        double fuelPrice = scanner.nextDouble();

		                        addFuel(connection, fuelType, fuelPrice);

		                        System.out.println("Fuel Added Successfully!");
		                        break;
		                    case 3:
		                        System.out.print("Enter Driver Name: ");
		                        String driverName = scanner.next();
		                        System.out.print("Enter Driver License Number: ");
		                        String licenseNumber = scanner.next();

		                        addDriver(connection, driverName, licenseNumber);

		                        System.out.println("Driver Added Successfully!");
		                        break;
		                    case 4:
		                        System.out.println("Exiting...");
		                        break;
		                    default:
		                        System.out.println("Invalid option. Please choose a valid option.");
		                        break;
		                }
		            } while (option != 4);

		            scanner.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    private static void addVehicle(Connection connection, String vehicleName, String vehicleType) throws SQLException {
		        String query = "INSERT INTO vehicle (vehicle_name, vehicle_type) VALUES (?, ?)";
		        try (PreparedStatement statement = connection.prepareStatement(query)) {
		            statement.setString(1, vehicleName);
		            statement.setString(2, vehicleType);
		            statement.executeUpdate();
		        }
		    }

		    private static void addFuel(Connection connection, String fuelType, double fuelPrice) throws SQLException {
		        String query = "INSERT INTO fuel (fuel_type, fuel_price) VALUES (?, ?)";
		        try (PreparedStatement statement = connection.prepareStatement(query)) {
		            statement.setString(1, fuelType);
		            statement.setDouble(2, fuelPrice);
		            statement.executeUpdate();
		        }
		    }

		    private static void addDriver(Connection connection, String driverName, String licenseNumber) throws SQLException {
		        String query = "INSERT INTO driver (driver_name, license_number) VALUES (?, ?)";
		        try (PreparedStatement statement = connection.prepareStatement(query)) {
		            statement.setString(1, driverName);
		            statement.setString(2, licenseNumber);
		            statement.executeUpdate();
		        }
		    }
		}

