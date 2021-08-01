package com.offcn.homework;

import java.util.ArrayList;
import java.util.Collection;


/**
 * 1.分析以下需求，并用代码实现：
 * 	(1)有如下代码：
 * 		Collection list = new ArrayList();
 *
 * 		list.add("a");
 * 		list.add("a");
 * 		list.add("a");
 * 		list.add("b");
 * 		list.add("b");
 * 		list.add("c");
 * 		list.add("d");
 * 		list.add("d");
 * 		list.add("d");
 * 		list.add("d");
 * 		list.add("d");
 *
 * 		System.out.println(frequency(list, "a"));	// 3
 * 		System.out.println(frequency(list, "b"));	// 2
 * 		System.out.println(frequency(list, "c"));	// 1
 * 		System.out.println(frequency(list, "d"));	// 5
 * 		System.out.println(frequency(list, "xxx"));	// 0
 * 	(2)实现frequency方法统计集合中指定元素出现的次数，如"a" 3,"b" 2,"c" 1
 */
public class Homework01 {
    public static void main(String[] args)  {
        Collection list = new ArrayList();

  		list.add("a");
  		list.add("a");
  		list.add("a");
  		list.add("b");
  		list.add("b");
  		list.add("c");
  		list.add("d");
  		list.add("d");
  		list.add("d");
  		list.add("d");
  		list.add("d");

  		System.out.println(frequency(list, "a"));	// 3
  		System.out.println(frequency(list, "b"));	// 2
  		System.out.println(frequency(list, "c"));	// 1
  		System.out.println(frequency(list, "d"));	// 5
  		System.out.println(frequency(list, "xxx"));	// 0
    }

    public static int frequency(Collection list,Object o){
        int count = 0;
        for (Object value : list) {
            if (value.equals(o)) {
                count++;
            }
        }
        return count;
    }
}
