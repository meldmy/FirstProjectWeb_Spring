package com.tutorialspoint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/**
 * Created by Dmytro Melnychuk on 07.01.2016.
 */
public class AhasDeleteIt {
    static String ii = "";
    public static void main(String[] args) throws Exception{
        System.out.println(getCommon());
    }

    public static int getCommon() throws FileNotFoundException {
        Scanner fr = new Scanner(new File("J:\\DukeUniversity\\Week1\\lotsOfWords.txt"));
        List<String> strings = new ArrayList<String>();
        while (fr.hasNext("\\s*[a-zA-Z]+"))
            strings.add(fr.next("\\s*[a-zA-Z]+").toLowerCase());

        Map<Integer, Integer> list = new HashMap<Integer, Integer>();

        for (int i = 0; i < strings.size(); i++) {
            if (list.containsKey(strings.get(i).length()))
                list.put(strings.get(i).length(), list.get(strings.get(i).length()) + 1);
            else list.put(strings.get(i).length(), 1);
        }
        int max = 0;
        int fing=0;

        for (Integer integer : list.keySet()) {
            if (max <= list.get(integer)){
                max = list.get(integer);
                fing=integer;
            }
        }
        return fing;

    }
}

