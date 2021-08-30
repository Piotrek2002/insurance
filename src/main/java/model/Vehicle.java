package model;

public class Vehicle {
    private long id;
    private long userId;
    private String login;
    private String brand;
    private String model;
    private String insertTime;

    public Vehicle(long id, long userId, String login, String brand, String model, String insertTime) {
        this.id = id;
        this.userId = userId;
        this.login = login;
        this.brand = brand;
        this.model = model;
        this.insertTime = insertTime;
    }

    public Vehicle() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", userId=" + userId +
                ", login='" + login + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", insertTime='" + insertTime + '\'' +
                '}';
    }
}
