public class Student extends Person {
    private double gpa;
    private static final double StipentAmount = 36660.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public String toString() {
        return "Student: " + super.toString();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount() {
        return gpa > 2.67 ? StipentAmount : 0.00;
    }
}
