package TCP;

import dao.InsuranceOfferDao;
import dao.VehicleDao;
import model.InsuranceOffer;
import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Message {
    List<Vehicle> vehicles;
    List<InsuranceOffer> insuranceOffers;

    public Message(String login) {
        insuranceOffers=new ArrayList<>();
        vehicles=new ArrayList<>();
        VehicleDao vehicleDao=new VehicleDao();
        InsuranceOfferDao insuranceOfferDao=new InsuranceOfferDao();
        vehicles=vehicleDao.findByLogin(login);
        for (Vehicle vehicle:vehicles){
            List<InsuranceOffer> insuranceOffersToAdd=insuranceOfferDao.findByVehicleId(vehicle.getId());
            insuranceOffers.addAll(insuranceOffersToAdd);
        }
    }

    public String getVehicles(){
        return vehicles.toString();
    }

    public String getInsuranceOffers(){
        return insuranceOffers.toString();
    }

    public String returnMessage(){
        StringBuilder text= new StringBuilder();
        InsuranceOfferDao insuranceOfferDao=new InsuranceOfferDao();
        for (Vehicle vehicle:vehicles){
            List<InsuranceOffer> insuranceOffersToAdd=insuranceOfferDao.findByVehicleId(vehicle.getId());
            text.append(vehicle.toString()).append(insuranceOffersToAdd.toString());
        }
        return text.toString();
    }
}
