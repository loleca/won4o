package entities;

import java.time.LocalDate;

public class Car {

    private double carConsumption;

    private double fuelTankSize;

    private String fuel;

    private int horsePower;

    private String gearBoxType;

    private int buildYear;

    private LocalDate registrationDate;

    private LocalDate insuranceDate;

    private LocalDate technicalReviewDate;

    private LocalDate tireChangeDate;

    private double kmForNextOilChange;


    public Car(double carConsumption, double fuelTankSize, String fuel, int horsePower, String gearBoxType, int buildYear,
               LocalDate registrationDate, LocalDate insuranceDate, LocalDate technicalReviewDate,
               LocalDate tireChangeDate, double kmForNextOilChange) {

        this.carConsumption = carConsumption;
        this.fuelTankSize = fuelTankSize;
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.gearBoxType = gearBoxType;
        this.buildYear = buildYear;
        this.registrationDate = registrationDate;
        this.insuranceDate = insuranceDate;
        this.technicalReviewDate = technicalReviewDate;
        this.tireChangeDate = tireChangeDate;
        this.kmForNextOilChange = kmForNextOilChange;
    }

    public double getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(double fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getCarConsumption() {
        return carConsumption;
    }

    public void setCarConsumption(double carConsumption) {
        this.carConsumption = carConsumption;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(String gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(LocalDate insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public LocalDate getTechnicalReviewDate() {
        return technicalReviewDate;
    }

    public void setTechnicalReviewDate(LocalDate technicalReviewDate) {
        this.technicalReviewDate = technicalReviewDate;
    }

    public LocalDate getTireChangeDate() {
        return tireChangeDate;
    }

    public void setTireChangeDate(LocalDate tireChangeDate) {
        this.tireChangeDate = tireChangeDate;
    }

    public double getKmForNextOilChange() {
        return kmForNextOilChange;
    }

    public void setKmForNextOilChange(double kmForNextOilChange) {
        this.kmForNextOilChange = kmForNextOilChange;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carConsumption=" + carConsumption +
                ", fuelTankSize=" + fuelTankSize +
                ", fuel='" + fuel + '\'' +
                ", horsePower=" + horsePower +
                ", gearBoxType='" + gearBoxType + '\'' +
                ", buildYear=" + buildYear +
                ", registrationDate=" + registrationDate +
                ", insuranceDate=" + insuranceDate +
                ", technicalReviewDate=" + technicalReviewDate +
                ", tireChangeDate=" + tireChangeDate +
                ", kmForNextOilChange=" + kmForNextOilChange +
                '}';
    }
}