import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(1L, "Jordano"),
                new Person(2L, "Ana"),
                new Person(3L, "Trevis"),
                new Person(4L, "Donald")
        );
        System.out.println("Original list of people");
        people.forEach((person) -> System.out.println("ID: " + person.getId() + ", Name:" + person.getName()));

        //convert procedure
        Map<Long, Person> peopleMap = people.stream().collect(Collectors.toMap(Person::getId, person -> person));

        System.out.println("\n Converted list of people");
        peopleMap.forEach((id,person) -> System.out.println("ID: " + id + ", Name:" + person.getName()));
    }
}