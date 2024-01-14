import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> peoplelist = new ArrayList<>();

        peoplelist.add(new Employee("John", "Lennon", "Manager", 27045.78));
        peoplelist.add(new Employee("George", "Harrison", "Developer", 50000.00));
        peoplelist.add(new Student("Ringo", "Starr", 2.5));
        peoplelist.add(new Student("Paul", "McCartney", 3.0));

        Collections.sort(peoplelist);
        printData(peoplelist);

    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

}
