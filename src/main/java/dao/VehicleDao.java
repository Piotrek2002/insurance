package dao;

import model.User;
import model.Vehicle;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDao {
    private static final String FIND_ALL_VEHICLE_BY_LOGIN_QUERY = "SELECT * from vehicles where login = ?;";
    public List<Vehicle> findByLogin(String login) {
        List<Vehicle> vehicles=new ArrayList<>();

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(FIND_ALL_VEHICLE_BY_LOGIN_QUERY);
             
             ) {
            statement.setString(1,login);
try (ResultSet resultSet = statement.executeQuery()){



            while (resultSet.next()) {
                Vehicle vehicle=new Vehicle();
                vehicle.setId(resultSet.getLong("id"));
                vehicle.setInsertTime(resultSet.getString("insert_time"));
                vehicle.setLogin(resultSet.getString("login"));
                vehicle.setUserId(resultSet.getInt("user_id"));
                vehicle.setBrand(resultSet.getString("brand"));
                vehicle.setModel(resultSet.getString("model"));
                vehicles.add(vehicle);
            }
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }
}
