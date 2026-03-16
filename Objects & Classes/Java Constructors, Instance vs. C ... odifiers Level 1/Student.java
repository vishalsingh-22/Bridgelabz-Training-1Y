class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int roll, String name, double cgpa) {
        this.rollNumber = roll;
        this.name = name;
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int roll, String name, double cgpa) {
        super(roll, name, cgpa);
    }

    void displayDetails() {
        System.out.println("Roll: " + rollNumber);
        System.out.println("Name: " + name);
    }
}