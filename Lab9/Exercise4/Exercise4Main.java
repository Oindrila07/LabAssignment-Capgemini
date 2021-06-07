package lab9Assignments.Exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4Main {
    public static int compareByName(Person p1, Person p2) { return p1.getName().compareTo(p2.getName()); }
    public static int compareByAge(Person p1, Person p2) { return p1.getAge().compareTo(p2.getAge()); }

    public static void main(String[] args) {
        List<Person> pList = new ArrayList<>();
        pList.add(new Person("Keshu", 11));
        pList.add(new Person("Raky", 14));
        pList.add(new Person("rater", 4));

//        Sort by name static method reference
        
        Collections.sort(pList, Exercise4Main::compareByName);
        System.out.println("Sorted by name: ");
        pList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

//        Sort by age static method reference
        Collections.sort(pList, Exercise4Main::compareByAge);
        System.out.println("Sorted by age: ");
        pList.stream()
                .map(y -> y.getAge())
                .forEach(System.out::println);
    }
}
