/*
This file is licensed by the MIT License
Copyright © 2022 RandomKiddo
For more information, visit https://opensource.org/licenses/MIT
Repository link: https://github.com/RandomKiddo/BadMath
*/

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.ArrayList;

public class BadMath {
    public static final void main(String[] args) 
    throws NoSuchFieldException, IllegalAccessException {
        Class<?> cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[])c.get(cache);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) { list.add(i); }
        Collections.shuffle(list);
        for (int i = 0; i < array.length; ++i) {
            array[i] = list.get(i);
        }
        Integer i = 1 + 1;
        System.out.print("1 + 1 is: ");
        System.out.println(i);
    }
}