package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Kuba", "Michalak", 42);
        Person person2 = new Person("Maciej", "Kucharski", 34);
        Person person3 = new Person("Szymon", "Wietrzała", 56);
        Person person4 = new Person("Michał", "Młot", 90);
        Person person5 = new Person("Tomek", "Purkurski", 67);
        Person person6 = new Person("Andrzej", "Michałek", 12);

        List<Person> people = Arrays.asList(person1, person2, person3, person4, person5, person6);

        // Consumer cons = person -> System.out.println(person);
        filterByPredicate(people, (person -> person.getAge() > 18));
        applyToList(people, person -> {
                    person.setAge(person.getAge() + 1);
                    return person;
                });
                consumeList(people, (person -> System.out.println(person)));
        //consumeList(people, System.out.println(person));
        //filterByPredicate
    }

    static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T object : list) {
            consumer.accept(object);
        }

    }

    static <T> void filterByPredicate(List<T> list, Predicate<T> predicate) {
        for (T object : list) {
            if (predicate.test(object)) {
                System.out.println(object);
            }


        }

    }

    static <T> void applyToList(List<T> list, Function<T, T> function) {
        for(int i = 0; i < list.size(); i++){
            T afterModification = function.apply(list.get(i));
            list.set(i, afterModification);
        }

    }
}

