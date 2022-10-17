package com.example;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.*;

import static java.util.stream.Collectors.groupingBy;

public class Test2 {
    public static void main(String[] args) {
        String res =
                Stream.of("a", "b", "c").filter(element -> element.contains("b")).findAny().get();
        System.out.println(res);

        String s= "afdafd";
        System.out.println(s.chars().filter(c -> c=='f').count());


        Stream<String> streamEmpty = Stream.empty();

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        Stream<String> streamOfArray = Stream.of("a", "b", "c");

        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();


        Stream.generate(() -> "element").
                limit(10).forEach(System.out::println);

        Stream.iterate(40, n -> n + 2).limit(20).forEach(System.out::println);

        IntStream.range(1, 3).forEach(System.out::println);
        LongStream.rangeClosed(1, 3).forEach(System.out::println);


        Random random = new Random();
        random.doubles(3).forEach(System.out::println);

        IntStream streamOfChars = "abc".chars();

        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");

        Stream<String> stream =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"));
        Optional<String> anyElement = stream.findAny();

        //Optional<String> firstElement = stream.findFirst();

        List<String> elements =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"))
                        .collect(Collectors.toList());

        elements.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        Optional<String> anyElement1 = elements.stream().findAny();
        Optional<String> firstElement1 = elements.stream().findFirst();


        Map<String, List<String>> m =Stream.of("abcd", "bbcd", "cbcd","abcd").limit(4)
                .collect(groupingBy(Function.identity()));
        m.entrySet().forEach(System.out::println);

    }
}
