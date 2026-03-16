class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (3.14 * radius * radius));
    }
}