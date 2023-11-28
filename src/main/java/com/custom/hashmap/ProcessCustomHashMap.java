package com.custom.hashmap;

import java.util.ArrayList;
import java.util.List;

public class ProcessCustomHashMap {

    private final static List<Object> objectList = new ArrayList<>();

    public void put(Object k, Object v) {
        if(objectList.size() == 0){
            objectList.add(new CustomMap(k,v));
            return;
        }
        String temp = null;
        List listTemp = (List) objectList.remove(1);
        for (int i = 1; i < listTemp.size(); i++) {
            temp = String.valueOf(objectList.get(i));
            String keyCustom = temp.substring(1, temp.indexOf("="));
            System.out.println(keyCustom);
             if (keyCustom.equals(String.valueOf(k))) {
                objectList.add(new CustomMap(k,v));
                break;
            }else {
                System.out.println("Duplicate Key !!!");
            }
        }

    }

    public Object print() {
        StringBuilder stringBuilder = new StringBuilder("");
        int count = 0;
        for (int i = 0; i <= objectList.size(); i++) {
            stringBuilder.append(objectList.get(i));

        }
        String s = String.valueOf(stringBuilder);
        String result = s.replace("}{", ", ");
        return result;

    }

    public Object getValueByKey(Object k) {
        String s = null;
        for (int i = 0; i <= objectList.size(); i++) {
            s = String.valueOf(objectList.get(i));
            String keyCustom = s.substring(1, s.indexOf("="));
            if (keyCustom.equals(String.valueOf(k))) {
                s = s.substring(s.indexOf("=") + 1, s.length() - 1);
                break;
            } else {
                s = null;
            }
        }
        return s;
    }

    public Object getKeyByValue(Object v) {
        String s = null;
        for (int i = 0; i <= objectList.size(); i++) {
            s = String.valueOf(objectList.get(i));
            String valueCustom = s.substring(s.indexOf("=") + 1, s.length() - 1);
            if (valueCustom.equals(String.valueOf(v))) {
                s = s.substring(1, s.indexOf("="));
                break;
            } else {
                s = null;
            }
        }
        return s;
    }
}
