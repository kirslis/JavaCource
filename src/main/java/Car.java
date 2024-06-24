import java.util.Date;

public class Car {
    private CarModel Model;
    private String RegistrationNumber;
    private long Mileage;
    private int YearOfRelease;
    private long Cost;

    public CarModel getModel() {
        return Model;
    }
    public void setModel(CarModel model) {
        Model = model;
    }
    public String getRegistrationNumber() {
        return RegistrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }
    public long getMileage() {
        return Mileage;
    }
    public void setMileage(long mileage) {
        Mileage = mileage;
    }
    public int getYearOfRelease() {
        return YearOfRelease;
    }
    public void setYearOfRelease(int yearOfRelease) {
        YearOfRelease = yearOfRelease;
    }
    public long getCost() {
        return Cost;
    }
    public void setCost(long cost) {
        Cost = cost;
    }

    public  Car(CarModel model, String RegistrationNumber, long mileage, int YearOfRelease, long Cost){
        this.Model = model;
        this.RegistrationNumber = RegistrationNumber;
        this.Mileage = mileage;
        this.YearOfRelease = YearOfRelease;
        this.Cost = Cost;
    }

    public String toString() {
        return "Car model: " + getModel() + "\nRegistration number: " + getRegistrationNumber() + "\nMileage: " + getMileage() + "\nYear of release: " + getYearOfRelease() + "\nCost: " + getCost();
    }


}
