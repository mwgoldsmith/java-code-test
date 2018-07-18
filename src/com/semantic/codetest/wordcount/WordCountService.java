package com.semantic.codetest.wordcount;

import java.util.Map;

public interface WordCountService {
    Map<String, Integer> countWords(final String text);
}
