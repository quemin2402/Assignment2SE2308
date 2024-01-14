public class Person implements Payable, Comparable<Person> {
    private final int id;
    private static int idCounter = 1;
    public String name;
    public String surname;

    public String toString(){
        return id + ". " + name + " " + surname;
    }

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    public double getPaymentAmount() {
        return 0.00;
    }

    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

}
