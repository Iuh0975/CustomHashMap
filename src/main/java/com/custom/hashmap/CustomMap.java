package com.custom.hashmap;


import java.util.ArrayList;
import java.util.List;

public class CustomMap<K, V> {

    private final List<Object> objectList = new ArrayList<>();

    public CustomMap() {
    }

    public Object setValue(Object key, Object value) {

        return "{" + String.valueOf(key) + "=" + String.valueOf(value) + "}";
    }

    public void put(Object k, Object v) {
        String temp = null;
        for (int i = 0; i < objectList.size(); i++) {
            temp = String.valueOf(objectList.get(i));
            String keyCustom = temp.substring(1, temp.indexOf("="));
            if (keyCustom.equals(String.valueOf(k))) {
                objectList.set(i, setValue(k, v));
                return;
            }
        }
        objectList.add(setValue(k, v));

    }


    public Object getValueByKey(Object k) {
        String s = null;
        for (int i = 0; i <= objectList.size() - 1; i++) {
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

//    public Object getKeyByValue(Object v) {
//        String s = null;
//        for (int i = 0; i <= objectList.size() - 1; i++) {
//            s = String.valueOf(objectList.get(i));
//            String valueCustom = s.substring(s.indexOf("=") + 1, s.length() - 1);
//            if (valueCustom.equals(String.valueOf(v))) {
//                s = s.substring(1, s.indexOf("="));
//                break;
//            } else {
//                s = null;
//            }
//        }
//        return s;
//    }

    @Override
    public String toString() {
        String result = "{}";
        if (!objectList.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder("");
            int count = 0;
            for (int i = 0; i <= objectList.size() - 1; i++) {
                stringBuilder.append(objectList.get(i));
            }
            String s = String.valueOf(stringBuilder);
            result = s.replace("}{", ", ");
        }

        return result;
    }
}

