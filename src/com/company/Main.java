package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        String harry = new String(Files.readAllBytes(Paths.get("C:\\Users\\Java01\\Desktop\\Harry.txt")));
        System.out.println(harry.length());
        harry = harry.replaceAll("[^A-Za-z ]", "");
        System.out.println(harry.substring(0, 234));

        harry = harry.toLowerCase();

        final String [] array = harry.split(" ");
        List<String> words = Arrays.asList(array);
        System.out.println(words.size());
        List<String> distinct = words.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct.size());
//сортируем по алфавиту!!!
        System.out.println(distinct.subList(0, 100));
        List<String> sorted = distinct.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted.subList(0, 100));
        //
    }
}
