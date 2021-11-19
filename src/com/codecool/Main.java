package com.codecool;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int countVocabulary(List<String> words) {
        Set<String> wordSet = new HashSet<>(words);
        return wordSet.size();
    }
  
    public List<String> getWords(String fileName) {
        return null;
    }
}
