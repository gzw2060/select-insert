package com.jk.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: select-insert
 * @description: ${description}
 * @author: 传闻中的郭先森
 * @create: 2018-07-16 15:49
 **/
public class NumberDemo {

    /*public static void main(String[] args) {
        *//*Integer num = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 == 1){
                System.err.print(i);
                num += i;
            }
        }
        System.out.println(num);*//*
        *//*System.out.println("结果1:    "+(2.0 - 1.9));
        System.out.println("结果2:    "+(1.0 - 0.1));*//*
    }*/
    /*public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        map.put("4", "value4");

        //第一种：普通使用，二次取值
        System.out.println("\n通过Map.keySet遍历key和value：");
        for(String key:map.keySet())
        {
            System.out.println("Key: "+key+" Value: "+map.get(key));
        }

        //第二种
        System.out.println("\n通过Map.entrySet使用iterator遍历key和value: ");
        Iterator map1it=map.entrySet().iterator();
        while(map1it.hasNext())
        {
            Map.Entry<String, String> entry=(Map.Entry<String, String>) map1it.next();
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("\n通过Map.entrySet遍历key和value");
        for(Map.Entry<String, String> entry: map.entrySet())
        {
            System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue());
        }

        //第四种
        System.out.println("\n通过Map.values()遍历所有的value，但不能遍历key");
        for(String v:map.values())
        {
            System.out.println("The value is "+v);
        }
    }*/

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Key1", "value1");
        map.put("Key2", "value2");
        map.put("Key3", "value3");
        for (String key : map.keySet()){
            System.out.println(key + map.get(key));
        }
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+next.getValue());
        }
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"----------"+entry.getValue());
        }
    }
}
