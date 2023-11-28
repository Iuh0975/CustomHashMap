package com.custom.hashmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomHashMapMain {
    public static void main(String[] args) {

        ProcessCustomHashMap processCustomHashMap = new ProcessCustomHashMap();
        processCustomHashMap.put(1,7);
        processCustomHashMap.put(2,2);
        processCustomHashMap.put(3,6);
        processCustomHashMap.put(3,6);
        System.out.println(processCustomHashMap.getValueByKey(1));
        System.out.println(processCustomHashMap.getKeyByValue(6));

//        CustomMap customMap = new CustomMap<Object, Object>();
//        customMap.put(5,5);
   //     System.out.println(customMap);

        HashMap map = new HashMap<Integer,Integer>();



    }
}
