package com.custom.hashmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomHashMapMain {
    public static void main(String[] args) {

//        ProcessCustomHashMap processCustomHashMap = new ProcessCustomHashMap();
//        processCustomHashMap.put(1,7);
//        processCustomHashMap.put(2,2);
//        processCustomHashMap.put(3,6);
//        processCustomHashMap.put(8,6);
//        System.out.println(processCustomHashMap.getValueByKey(8));
//        System.out.println(processCustomHashMap.getKeyByValue(6));

        CustomMap customMap = new CustomMap<Object, Object>();
        CustomMap customMap01 = new CustomMap<Object, Object>();
        customMap.put(5,5);
        customMap.put(6,6);
        customMap.put(1,3);
        customMap.put(1,4);
        customMap.put("customMap","custom");
        System.out.println(customMap.getValueByKey(8));
        System.out.println(customMap);
        System.out.println(customMap01);

        HashMap originalMap = new HashMap<Integer,Integer>();
        HashMap originalMap01 = new HashMap<Integer,Integer>();
        originalMap.put("map01","a");
        originalMap.put("map02","b");
        originalMap.put("map03","c");
        originalMap.put("map03","d");
        System.out.println(originalMap);
        System.out.println(originalMap.get("map09"));
        System.out.println(originalMap01);



    }
}
