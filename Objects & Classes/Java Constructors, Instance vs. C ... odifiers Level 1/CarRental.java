class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1000;

    CarRental() {
        customerName = "Customer";
        carModel = "Basic Model";
        rentalDays = 1;
    }

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}