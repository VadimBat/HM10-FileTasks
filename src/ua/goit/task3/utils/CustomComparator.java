package ua.goit.task3.utils;

import java.util.Comparator;
import java.util.Map;

public class CustomComparator implements Comparator<String> {

    private Map <String,Integer> map;

    public CustomComparator(Map <String,Integer> map) {
        this.map = map;
    }


    @Override
    public int compare(String o1, String o2) {
        if(map.get(o1) >= map.get(o2)){
            return  -1;
        }
        return 1;
    }
}
