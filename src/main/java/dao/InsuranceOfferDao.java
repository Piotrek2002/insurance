package dao;

import model.InsuranceOffer;
import model.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InsuranceOfferDao {
    private static final String FIND_ALL_VEHICLE_BY_LOGIN_QUERY = "SELECT * from insurance_offers where vehicle_id = ?;";
    public List<InsuranceOffer> findByVehicleId(long vehicleId) {
        List<InsuranceOffer> insuranceOffers=new ArrayList<>();
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(FIND_ALL_VEHICLE_BY_LOGIN_QUERY);
             ) {statement.setLong(1,vehicleId);
            try(ResultSet resultSet = statement.executeQuery()) {




            while (resultSet.next()) {
                InsuranceOffer insuranceOffer=new InsuranceOffer();
                insuranceOffer.setId(resultSet.getLong("id"));
                insuranceOffer.setInsurer(resultSet.getString("insurer"));
                insuranceOffer.setInsertTime(resultSet.getString("insert_time"));
                insuranceOffer.setVehicle_id(resultSet.getLong("vehicle_id"));
                insuranceOffer.setPrice(resultSet.getDouble("price"));
                insuranceOffers.add(insuranceOffer);
            }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insuranceOffers;
    }
}
