package com.semantic.codetest.wordcount;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ServiceTests {

    @Test
    public void countWordsTest() {
        Map<String, Integer> count;

        count = new Service().countWords("first  second third  first first   second");
        assertEquals(3, (int) count.get("first"));
        assertEquals(2, (int) count.get("second"));
        assertEquals(1, (int) count.get("third"));
    }
}
