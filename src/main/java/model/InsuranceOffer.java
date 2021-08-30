package model;

public class InsuranceOffer {
    private long id;
    private long vehicle_id;
    private String insurer;
    private String insertTime;
    private double price;

    public InsuranceOffer(long id, long vehicle_id, String insurer, String insertTime, double price) {
        this.id = id;
        this.vehicle_id = vehicle_id;
        this.insurer = insurer;
        this.insertTime = insertTime;
        this.price=price;
    }

    public InsuranceOffer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getInsurer() {
        return insurer;
    }

    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InsuranceOffer{" +
                "id=" + id +
                ", vehicle_id=" + vehicle_id +
                ", insurer='" + insurer + '\'' +
                ", insertTime='" + insertTime + '\'' +
                ", price=" + price +
                '}';
    }
}
