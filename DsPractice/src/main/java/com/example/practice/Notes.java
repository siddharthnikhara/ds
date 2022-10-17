package com.example.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Notes {

    private int id;
    private String tagName;
    private long tagId;

    public Notes(int id, String tagName, long tagId) {
        this.id = id;
        this.tagName = tagName;
        this.tagId = tagId;
    }

    public int getId() {
        return id;
    }

    public String getTagName() {
        return tagName;
    }

    public long getTagId() {
        return tagId;
    }
// getters and setters

    public void setId(int id) {
        this.id = id;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", tagName='" + tagName + '\'' +
                ", tagId=" + tagId +
                '}';
    }

    static class Book {
        private String name;
        private int releaseYear;
        private String isbn;

        public Book(String name, int releaseYear, String isbn) {
            this.name = name;
            this.releaseYear = releaseYear;
            this.isbn = isbn;
        }

        public String getName() {
            return name;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
    }

    public static void main(String[] args) {
        List<Notes> list = new ArrayList<>();
        list.add(new Notes(1, "s", 2l));
        list.add(new Notes(2, "s", 2l));
        list.stream().sorted(Comparator.comparingLong(Notes::getTagId)).collect(Collectors.toList());
//        Map<String,Notes> map = new LinkedHashMap<>();
//        map.put("s",new Notes(1,"s",2l));
//        System.out.println(list.stream().sorted(Comparator.comparingInt(Notes::getId).reversed()).findAny().get().getId());


//        Map<String, Long>m=list.stream().collect(Collectors.toMap(Notes::getTagName,Notes::getTagId));
//        Map<String, Long>m1= map.entrySet().stream().collect(Collectors.toMap(a -> a,a -> a));

//        List<Book> bookList = new ArrayList<>();
//        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
//        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
//        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
//        Map<Integer, Book> m = listToMapWithDupKeyError(bookList);
//        m.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
//        System.out.println(m);
        List<Integer> l = Arrays.asList(1, 2, 3);
        System.out.println(l.stream().mapToInt(a -> a).max().getAsInt());
        Stream<Notes> s = Stream.of(new Notes(1, "d", 3l), new Notes(2, "e", 3));
        System.out.println(s.max(Comparator.comparing(Notes::getId)).get().id);
        //l.stream().

    }

    public static Map<Integer, Book> listToMapWithDupKeyError(List<Book> books) {
        return books.stream().collect(
                Collectors.toMap(Book::getReleaseYear, Function.identity(), (o, l) -> o));
    }
}