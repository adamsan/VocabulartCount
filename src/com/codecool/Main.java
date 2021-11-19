package com.codecool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("This program counts the different words a text corpus uses. Only distinct words count.");
            System.out.println("Please add the name of the file as the first argument!");
            return;
        }
        String fileName = args[0]; //"romeo_and_juliet.txt";
        List<String> words = getWords(fileName);
        int vocabularyCount = countVocabulary(words);
        System.out.println(vocabularyCount + " number of different words were used in " + fileName);
    }

    public static int countVocabulary(List<String> words) {
        Set<String> wordSet = new HashSet<>(words);
        return wordSet.size();
    }

    public static List<String> getWords(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String line;
            List<String> list = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                addWords(line, list);
            }
            return list;
        }
    }

    private static void addWords(String line, List<String> list) {
        String[] words = line.split(" ");
        for (String word : words) {
            list.add(word);
        }
    }
}
