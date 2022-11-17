package validations;

import entities.Car;

import java.time.LocalDate;

public class CarValidation {

    public boolean isCarTypeValid(String carType) {

        return carType.length() <= 100;
    }

    public boolean isCarBrandValid(String carBrand) {

        return carBrand.length() <= 20;
    }

    public boolean isCarModelValid(String carModel) {

        return carModel.length() <= 20;
    }

    public boolean isCarConsumptionValid(double carConsumption) {

        return carConsumption > 0;
    }

    public boolean isCarFuelTankSizeValid(double fuelTankSize) {

        return fuelTankSize > 0;
    }

    public boolean isEngineHorsePowerValid(int horsePower) {

        return horsePower > 0;
    }

    public boolean isBuildYearValid(int buildYear) {

        LocalDate date = LocalDate.now();

        return buildYear > 0 && buildYear < date.getYear();
    }

    public boolean isRegistrationDateValid(LocalDate registrationYear) {

        return registrationYear.isBefore(LocalDate.now());
    }

    public boolean isInsuranceDateValid(LocalDate insuranceDate) {

        return insuranceDate.isBefore(LocalDate.now());
    }

    public boolean isTechnicalReviewDateValid(LocalDate technicalReviewDate) {

        return technicalReviewDate.isBefore(LocalDate.now());
    }

    public boolean isTireChangeDateValid(LocalDate tireChangeDate) {

        return tireChangeDate.isAfter(LocalDate.now());
    }

    public boolean isKmForNextOilChangeValid(double oilChangeKm) {

        return oilChangeKm >= 0;
    }

    public String isEverythingValid(Car car) {

        if (!isCarConsumptionValid(car.getCarConsumption())) {

            return "Can Consumption";
        } else if (!isCarFuelTankSizeValid(car.getFuelTankSize())) {

            return "Fuel Tank Size";
        } else if (!isEngineHorsePowerValid(car.getHorsePower())) {

            return "Horse Power";
        } else if (!isBuildYearValid(car.getBuildYear())) {

            return "Build Year";
        } else if (!isRegistrationDateValid(car.getRegistrationDate())) {

            return "Registration Date";
        }  else if (!isInsuranceDateValid(car.getInsuranceDate())){

            return "Insurance Date";
        }else if (!isTechnicalReviewDateValid(car.getTechnicalReviewDate())){

            return "Technical Review Date";
        }else if (!isTireChangeDateValid(car.getTireChangeDate())){

            return "Tire change Date";
        }else if (!isKmForNextOilChangeValid(car.getKmForNextOilChange())){

            return "Next Oil Change Number";
        }
        return null;
    }
}