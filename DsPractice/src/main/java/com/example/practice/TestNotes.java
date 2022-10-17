package com.example.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestNotes {

    public static void main(String[] args) {

        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        noteLst.add(new Notes(6, "note4", 66));

//use third mergeFunction argument (oldValue, newValue) -> oldValue solved the duplicated key issue by considering old value
        Map<String, Long> notesRecords = noteLst.stream().collect(
                Collectors.toMap(Notes::getTagName, Notes::getTagId,
                        (oldValue, newValue) -> newValue
                )
        );

        System.out.println("Notes : " + notesRecords);
    }
}