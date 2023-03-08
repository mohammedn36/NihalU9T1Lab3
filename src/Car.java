public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean getElectric(){
        return electric;
    }

    public boolean getDiscountApplied(){
        return discountApplied;
    }

    public void printCar(){
        System.out.println("License Plate: " + getLicensePlate()
                + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() +
                "\nElectric? " + electric + "\nDiscount applied? " + discountApplied);
    }
}