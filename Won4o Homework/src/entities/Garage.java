package entities;

import java.util.List;

public class Garage {

    private String garageName;

    private List<Car> availableCars;

    public Garage(String garageName, List<Car> availableCars) {
        this.garageName = garageName;
        this.availableCars = availableCars;
    }

    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(List<Car> availableCars) {
        this.availableCars = availableCars;
    }
}
