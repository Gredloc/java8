package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        //numbers.stream().forEach(number -> System.out.println(number));
        Integer integer = numbers.stream()
                .filter(number -> number>10)
                .map(number -> number*10)
                .min(Integer::compareTo).get();
        System.out.println(integer);

        List<String> listOfNames = Arrays.asList("Anna", "Justyna", "Piotr", "Zygfryd", "Kunegunda", "Włodzimierz:");

        //zostawic imiona wiecej niz 5 liter .filter
        // dokleic @ zz przodu
        // ograniczyc do 2 osob i je wywietlic

        listOfNames.stream()
                .filter(name -> name.length()>5)
                .map(name-> name.toUpperCase())
                .map(name-> "@" + name)
                .limit(2)
                .forEach(System.out::println);



    }
}
// liczby >10
//liczby*10
//najmniejsza liczba z podanych