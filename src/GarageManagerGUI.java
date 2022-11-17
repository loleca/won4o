import entities.Car;
import validations.CarValidation;

import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GarageManagerGUI extends JFrame {
    private JPanel MainPanel;
    private JPanel TitlePanel;
    private JPanel ActionPanel;
    private JPanel DisplayPanel;
    private JLabel Title;
    private JButton buttonAdd;
    private JButton Delete;
    private JButton buttonFilter;
    private JButton buttonUpdate;
    private JButton DisplayAll;
    private JList<Car> listCars;
    private DefaultListModel<Car> model = new DefaultListModel<>();
    private JPanel CarAddPanel;
    private JTextField carType;
    private JTextField regNumber;
    private JTextField carBrand;
    private JTextField carTirechangeDate;
    private JTextField carCheckupDate;
    private JTextField carInsuranceDate;
    private JTextField carRegistrationDate;
    private JTextField carRelease;
    private JTextField carEnginePower;
    private JTextField carCapacity;
    private JTextField carConsumption;
    private JTextField carModel;
    private JComboBox comboFuelType;
    private JComboBox comboTransmissionType;
    private JTextField carOilChange;
    private JButton addSubmit;
    private JButton updateSubmit;
    private JList listFiltered;
    private JPanel FilteredPanel;
    private JPanel RegistrationSearchPanel;
    private JTextField carSearchRegistration;
    private JButton buttonSearch;
    private JPanel FilterPanel;
    private JTextField regNumberF;
    private JTextField carBrandF;
    private JTextField carModelF;
    private JTextField carRegistrationDateF;
    private JTextField carInsuranceDateF;
    private JButton buttonSearchF;

    private List<Car> cars = new ArrayList<>();

    CarValidation carValidation = new CarValidation();

    public GarageManagerGUI() {
        setContentPane(MainPanel);
        setTitle("Garage Manager");
        setSize(700, 700);
        TitlePanel.setSize(700, 150);
        ActionPanel.setSize(700, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        CarAddPanel.setVisible(false);
        FilteredPanel.setVisible(false);
        FilterPanel.setVisible(false);
        RegistrationSearchPanel.setVisible(false);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarAddPanel.setVisible(true);
                DisplayPanel.setVisible(false);
                RegistrationSearchPanel.setVisible(false);
                FilterPanel.setVisible(false);
                FilteredPanel.setVisible(false);
                updateSubmit.setVisible(false);
                addSubmit.setVisible(true);
            }
        });
        addSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarAddPanel.setVisible(false);
                DisplayPanel.setVisible(true);

                double consumption = Double.parseDouble(carConsumption.getText());

                double fuelTankSize = Double.parseDouble(carCapacity.getText());

                // String fuel = (String) comboFuelType.getSelectedItem();

                String fuel = "random";

                int horsePower = Integer.parseInt(carEnginePower.getText());

                //  String gearBoxType = (String) comboTransmissionType.getSelectedItem();

                String gearBoxType = "test";

                int buildYear = Integer.parseInt(carRelease.getText());

                LocalDate registrationDate = LocalDate.parse(carRegistrationDate.getText());

                LocalDate insuranceDate = LocalDate.parse(carInsuranceDate.getText());

                LocalDate technicalReviewDate = LocalDate.parse(carCheckupDate.getText());

                LocalDate tireChangeDate = LocalDate.parse(carTirechangeDate.getText());

                double kmForNextOilChange = Double.parseDouble(carOilChange.getText());

                Car newCar = new Car(consumption, fuelTankSize, fuel, horsePower, gearBoxType, buildYear, registrationDate,
                        insuranceDate, technicalReviewDate, tireChangeDate, kmForNextOilChange);

                String wrongPart = carValidation.isEverythingValid(newCar);

                if (wrongPart != null) {

                    System.out.printf("%s is not Valid", wrongPart);

                    String message = wrongPart + " is not valid!";

                    JOptionPane.showMessageDialog(GarageManagerGUI.this,
                            message, "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                    model.addElement(newCar);

                    listCars.setModel(model);

                    JOptionPane.showMessageDialog(GarageManagerGUI.this,
                            "Vehicle Added Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        buttonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarAddPanel.setVisible(false);
                DisplayPanel.setVisible(false);
                RegistrationSearchPanel.setVisible(true);
                FilterPanel.setVisible(false);
                FilteredPanel.setVisible(false);

            }
        });
        updateSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarAddPanel.setVisible(false);
                DisplayPanel.setVisible(true);
            }
        });
        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int index = listCars.getSelectedIndex();

                System.out.println(index);

                model.remove(index);

                JOptionPane.showMessageDialog(GarageManagerGUI.this,
                        "Vehicle Deleted Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        buttonFilter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarAddPanel.setVisible(false);
                DisplayPanel.setVisible(false);
                RegistrationSearchPanel.setVisible(false);
                FilterPanel.setVisible(true);
                FilteredPanel.setVisible(false);
            }
        });
        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean test =true;
                if(test){
                    CarAddPanel.setVisible(true);
                    DisplayPanel.setVisible(false);
                    RegistrationSearchPanel.setVisible(false);
                    FilterPanel.setVisible(false);
                    FilteredPanel.setVisible(false);
                    addSubmit.setVisible(false);
                    updateSubmit.setVisible(true);

                }
                else {
                    JOptionPane.showMessageDialog(GarageManagerGUI.this,
                            "Car with registration"+" was not found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        DisplayAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CarAddPanel.setVisible(false);
                DisplayPanel.setVisible(true);
                RegistrationSearchPanel.setVisible(false);
                FilterPanel.setVisible(false);
                FilteredPanel.setVisible(false);
            }
        });
        buttonSearchF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilteredPanel.setVisible(true);
                FilterPanel.setVisible(false);

            }
        });
    }
}
