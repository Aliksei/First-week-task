package com.it.academy.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ListFunction {

    public static List<Integer> addition(List<Integer> first, List<Integer>... lists) {
        TreeSet<Integer> treeSet = new TreeSet<>(first);

        for (List<Integer> list : lists) {
            treeSet.addAll(list);
        }
        return new ArrayList<>(treeSet);
    }

}
