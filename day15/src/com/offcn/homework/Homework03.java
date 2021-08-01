package com.offcn.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 3.分析以下需求，并用代码实现（此题使用4种方法完成）：
 * 	(1)定义Collection集合，存入多个字符串，其中包含三个连续的"def"
 * 	(2)删除集合中字符串"def"
 * 	(3)然后利用迭代器遍历集合元素并输出
 */
public class Homework03 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("def");
        list.add("def");
        list.add("def");
        list.add("c");

//        del01(list,"def");
//        del02(list,"def");
        del04((List) list,"def");

        System.out.println(list);
    }

    public static void del01(Collection list,Object o){
        while (list.remove(o));
    }

    public static void del02(Collection list,Object o){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(o)){
                iterator.remove();
            }
        }
    }

    public static void del03(List list, Object o){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(o)){
                list.remove(o);
                i--;
            }
        }
    }
    public static void del04(Collection list,Object o){
        Object[] objects = list.toArray();
        list.clear();
        for (Object object : objects) {
            if (!o.equals(object)){
                list.add(object);
            }
        }
    }
}
