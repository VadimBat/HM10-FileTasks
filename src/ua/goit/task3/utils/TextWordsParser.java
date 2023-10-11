package ua.goit.task3.utils;

import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TextWordsParser {
    public void parseAndPrintResults(File file){
        TextReader reader = new TextReader();
        String content = reader.contentRead(file);
        Map<String, Integer> wordsToCount = new HashMap<>();
        String[] words = content.split("\\s+");

        for (String word : words) {
            if (!wordsToCount.containsKey(word)){
                wordsToCount.put(word,0);
            }
            wordsToCount.put(word, wordsToCount.get(word)+1);
        }
        Comparator<String> comparator= new CustomComparator(wordsToCount);
        Map<String, Integer> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(wordsToCount);
        for (String word: sortedMap.keySet()) {
            System.out.println(word + " " + wordsToCount.get(word));
        }
    }
}
