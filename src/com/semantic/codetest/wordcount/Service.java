package com.semantic.codetest.wordcount;

import java.util.HashMap;
import java.util.Map;

public class Service implements WordCountService {
    @Override
    public Map<String, Integer> countWords(String text) {
        if (text == null)
          throw new NullPointerException("Parameter text is invalid");

        Map<String, Integer> result = new HashMap<>();

        String[] words = text.split(" +");
        for (String word : words) {
            int count = result.getOrDefault(word, 0);
            result.put(word, count + 1);
        }

        return result;
    }
}
