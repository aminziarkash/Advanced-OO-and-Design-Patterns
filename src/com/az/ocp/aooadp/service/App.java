package com.az.ocp.aooadp.service;

import com.az.ocp.aooadp.cohesion.solution.BudgetReport;
import com.az.ocp.aooadp.cohesion.solution.Options;
import com.az.ocp.aooadp.coupling.problem.SalesTaxRates;
import com.az.ocp.aooadp.dao.solution.Book;
import com.az.ocp.aooadp.dao.solution.InMemoryBookDao;
import com.az.ocp.aooadp.factory.Factory;
import com.az.ocp.aooadp.factory.VehicleFactory;
import com.az.ocp.aooadp.factory.impl.FactoryImpl;
import com.az.ocp.aooadp.isaandhasa.BmwM3Convertible;
import com.az.ocp.aooadp.isaandhasa.Vehicle;
import com.az.ocp.aooadp.objectcompositionprinciples.GiftBox;
import com.az.ocp.aooadp.objectcompositionprinciples.MailerBox;
import com.az.ocp.aooadp.singleton.problem.Show;

public class App {

    public static void main(String[] args) {

        App application = new App();

        application.isAHasAExample();

        application.couplingAndCohesionExample();

        application.objectCompositionExample();

        application.singletonExample();
        
        application.daoPatternExample();

        application.factoryPatternExample();

    }
    
    private void singletonExample() {
        System.out.println("Singleton Pattern\n");
        System.out.println("Booking same seat for the show WITHOUT following the 'Singleton Design Pattern'");
        Show.ticketAgentsBooked("1A");
        Show.ticketAgentsBooked("1A");
        
        System.out.println("\nBooking same seat for the show following the 'Singleton Design Pattern'");
        com.az.ocp.aooadp.singleton.solution.Show.ticketAgentsBooked("1A");
        com.az.ocp.aooadp.singleton.solution.Show.ticketAgentsBooked("1A");
        
        addSeparaor();
    }

    private void factoryPatternExample() {
        System.out.println("Factory Pattern\n");

        VehicleFactory factory = VehicleFactory.INSTANCE;
        Vehicle vehicle = factory.createVehicle("car"); // create me a car
        vehicle.drive();
        vehicle = factory.createVehicle("truck"); // create me a truck
        vehicle.drive();

        addSeparaor();
    }

    private void objectCompositionExample() {
        System.out.println("Object Composition\n");

        GiftBox box = new GiftBox();
        MailerBox mailerBox = new MailerBox(box);

        mailerBox.seal();
        mailerBox.pack();
        mailerBox.addPostage();
        mailerBox.ship();
        
        addSeparaor();
    }

    private void daoPatternExample() {
        System.out.println("DAO Pattern\n");
        
        Factory factory = new FactoryImpl();
        InMemoryBookDao inMemoryBookDao = (InMemoryBookDao) factory.createDao();
        Book book = createBook();
        inMemoryBookDao.create(book);
        inMemoryBookDao.update(book);
        inMemoryBookDao.delete(book);
        
        addSeparaor();
    }

    private Book createBook() {
        Book book = new Book();
        book.setAuthor("A Ziarkash");
        book.setIsbn("123454321");
        book.setTitle("Advanced OO and Design Patterns");
        
        return book;
    }
    private void isAHasAExample() {
        addSeparaor();
        System.out.println("IS-A and HAS-A\n");
        
        BmwM3Convertible myM3 = createCar();
        
        String brand = myM3.getCarBrand();
        String model = myM3.getCarModel();
        int horsePower = myM3.getHorsePower();
        boolean isConvertible = myM3.isConvertible();
        int newHorsePower = horsePower + myM3.increasePower();
        String vehicleType = myM3.getVehicleType();

        System.out.println("Vehicle type\t\t:\t" + vehicleType);
        System.out.println("Car brand\t\t:\t" + brand);
        System.out.println("Car model\t\t:\t" + model);
        System.out.println("Horse Power\t\t:\t" + horsePower);
        System.out.println("Is Convertible\t\t:\t" + isConvertible);
        System.out.println("\nSuper tuning the car...\n");
        System.out.println("New Horse Power\t\t:\t" + newHorsePower);
        myM3.drive();

        addSeparaor();
    }
    
    private BmwM3Convertible createCar() {
        BmwM3Convertible myM3 = new BmwM3Convertible();
        myM3.setCarBrand("BMW");
        myM3.setCarModel("M3 Cabrio");
        myM3.setNumberOfSeats(4);
        myM3.setHorsePower(425);
        
        return myM3;
    }

    private void couplingAndCohesionExample() {
        System.out.println("Coupling and Cohesion\n");

        couplingExample();

        cohesionExample();

        addSeparaor();
    }

    private void couplingExample() {
        System.out.println("Coupling");
        SalesTaxRates rates = new SalesTaxRates();
        System.out.println("Creating a SalesTaxRates object...");
        System.out.println("adjustedSalesRate before modifying the implementation\t:\t" + rates.adjustedSalesRate);
        rates.adjustedSalesRate = 8237462;
        System.out.println("Modify a field from this object (adjustedSalesRate)...");
        System.out.println("adjustedSalesRate after the modification\t\t:\t" + rates.adjustedSalesRate);
        addSubSeparaor();
    }

    private void cohesionExample() {
        System.out.println("Cohesion");
        
        BudgetReport budgetReport = new BudgetReport();
        budgetReport.generateBudgetReport(new Options());
        
        addSubSeparaor();
    }

    private void addSeparaor() {
        System.out.println(
            "**********************************************************************************************************");
    }
    
    private void addSubSeparaor() {
        System.out.println(
            "----------------------------------------------------------------------------------------------------------");
    }
}
