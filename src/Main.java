import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> peoplelist = new ArrayList<>();

        peoplelist.add(new Employee("Merey", "Ibraim", "Developer", 300000.00));
        peoplelist.add(new Student("Emma", "Proulx", 2.2));
        peoplelist.add(new Employee("Otto", "Benson", "Software tester",  275000.00));
        peoplelist.add(new Student("Hans", "Zimmer", 3.0));

        Collections.sort(peoplelist);
        printData(peoplelist);

    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

}
